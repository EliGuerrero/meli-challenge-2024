package co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 18/04/2024
 */
@RestController
@RequestMapping("/api/seguridad")
@RequiredArgsConstructor
public class DemoController {

    @PostMapping(value = "demo")
    public String welcome() {
        return "Bienvenido al endpoint de seguridad";
    }
}
