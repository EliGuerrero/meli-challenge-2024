package co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.auth;

import co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.entidad.UsuarioEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 20/04/2024
 */
public class CustomUserDetails implements UserDetails {

    private final UsuarioEntity usuarioEntity;

    public CustomUserDetails(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return usuarioEntity.getRoles().stream()
                .map(rol -> new SimpleGrantedAuthority("ROLE_" + rol.getNombre()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return usuarioEntity.getPassword();
    }

    @Override
    public String getUsername() {
        return usuarioEntity.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}