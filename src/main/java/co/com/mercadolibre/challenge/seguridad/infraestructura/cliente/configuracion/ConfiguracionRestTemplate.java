package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.configuracion;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 17/04/2024
 */
@Configuration
public class ConfiguracionRestTemplate {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.setConnectTimeout(Duration.ofMillis(300000)).build();
    }
}