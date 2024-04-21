package co.com.mercadolibre.challenge.seguridad.aplicacion.comando;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;


/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 18/04/2024
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ComandoRegister {
    String username;
    String password;
    ArrayList<ComandoRol> roles;
}