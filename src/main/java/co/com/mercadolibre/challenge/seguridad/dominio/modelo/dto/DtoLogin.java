package co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 18/04/2024
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DtoLogin {
    private String username;
    private String password;
}