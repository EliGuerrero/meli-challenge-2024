package co.com.mercadolibre.challenge.seguridad.aplicacion.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 19/04/2024
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoTarjeta {
    private Long idTarjeta;
    private Long idCliente;
    private String codigoZip;
    private String fecAlta;
    private String creditCardNum;
    private String cuentaNumero;
    private String geoLatitud;
    private String geoLongitud;
    private String ip;
    private Long cantidadComprasRealizadas;
}