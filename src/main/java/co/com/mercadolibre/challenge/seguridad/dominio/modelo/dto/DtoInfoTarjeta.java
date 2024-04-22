package co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 21/04/2024
 */
@NoArgsConstructor
@Getter
public class DtoInfoTarjeta {
    private Long idTarjeta;
    private String creditCardNum;
    private String cuentaNumero;
    private Long cantidadComprasRealizadas;

    public DtoInfoTarjeta(Long idTarjeta, String creditCardNum, String cuentaNumero, Long cantidadComprasRealizadas) {
        this.idTarjeta = idTarjeta;
        this.creditCardNum = creditCardNum;
        this.cuentaNumero = cuentaNumero;
        this.cantidadComprasRealizadas = cantidadComprasRealizadas;
    }
}