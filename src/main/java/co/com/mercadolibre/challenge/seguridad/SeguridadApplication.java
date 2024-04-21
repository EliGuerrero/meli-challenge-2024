package co.com.mercadolibre.challenge.seguridad;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 16/04/2024
 */
@SpringBootApplication
public class SeguridadApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Cliente.class);

	public static void main(String[] args) {
		SpringApplication.run(SeguridadApplication.class, args);
		LOGGER.info("Subió la aplicación");
	}

}
