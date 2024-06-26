package co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad;

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
public class Tarjeta {
    private Long idTarjeta;
    private String codigoZip;
    private String fecAlta;
    private String creditCardNum;
    private String cuentaNumero;
    private String geoLatitud;
    private String geoLongitud;
    private String ip;
    private Long cantidadComprasRealizadas;
}