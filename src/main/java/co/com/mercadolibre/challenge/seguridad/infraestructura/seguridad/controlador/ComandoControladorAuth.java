package co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.controlador;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoToken;
import co.com.mercadolibre.challenge.seguridad.dominio.servicio.seguridad.AuthService;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoLogin;
import co.com.mercadolibre.challenge.seguridad.aplicacion.comando.ComandoRegister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 18/04/2024
 */
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class ComandoControladorAuth {

    private final AuthService authService;

    @PostMapping(value = "login")
    public ResponseEntity<DtoToken> login(@RequestBody DtoLogin request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value = "register")
    public ResponseEntity<DtoToken> register(@RequestBody ComandoRegister request) {
        return ResponseEntity.ok(authService.register(request));
    }
}