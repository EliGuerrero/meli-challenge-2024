package co.com.mercadolibre.challenge.seguridad.dominio.servicio.seguridad;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoToken;
import co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.adaptador.repositorio.RepositorioUsuarioPostgres;
import co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.auth.CustomUserDetails;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoLogin;
import co.com.mercadolibre.challenge.seguridad.aplicacion.comando.ComandoRegister;
import co.com.mercadolibre.challenge.seguridad.dominio.servicio.seguridad.jwt.JwtService;
import co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.entidad.RolEntity;
import co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.entidad.UsuarioEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.stream.Collectors;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 18/04/2024
 */
@Service
@RequiredArgsConstructor
public class AuthService {

    private final RepositorioUsuarioPostgres repositorioUsuarioPostgres;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public DtoToken login(DtoLogin request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UsuarioEntity usuarioEntity = repositorioUsuarioPostgres.findByUsername(request.getUsername());
        CustomUserDetails customUserDetails = new CustomUserDetails(usuarioEntity);
        String token = jwtService.getToken(customUserDetails);
        return DtoToken.builder()
                .token(token)
                .build();

    }

    public DtoToken register(ComandoRegister request) {
        UsuarioEntity usuarioEntity = UsuarioEntity.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .roles(request.getRoles().stream().map(rol -> new RolEntity(rol.getId(), rol.getNombre())).collect(Collectors.toList()))
                .build();

        repositorioUsuarioPostgres.save(usuarioEntity);
        CustomUserDetails customUserDetails = new CustomUserDetails(usuarioEntity);

        return DtoToken.builder()
                .token(jwtService.getToken(customUserDetails))
                .build();
    }
}