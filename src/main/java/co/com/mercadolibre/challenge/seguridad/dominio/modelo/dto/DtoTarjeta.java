package co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 19/04/2024
 */

@NoArgsConstructor
@Getter
public class DtoTarjeta {
    private Long idTarjeta;
    private Long cantidadComprasRealizadas;


    public DtoTarjeta(Long idTarjeta, Long cantidadComprasRealizadas) {
        this.idTarjeta = idTarjeta;
        this.cantidadComprasRealizadas = cantidadComprasRealizadas;
    }
}
