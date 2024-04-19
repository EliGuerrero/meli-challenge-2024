package co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 16/04/2024
 */
@Getter
@Setter
@AllArgsConstructor
public class Cliente {
    private Long idCliente;
    private String fecAlta;
    private String userName;
    private String codigoZip;
    private String creditCardNum;
    private String creditCardCcv;
    private String cuentaNumero;
    private String direccion;
    private String geoLatitud;
    private String geoLongitud;
    private String colorFavorito;
    private String fotoDni;
    private String ip;
    private String auto;
    private String autoModelo;
    private String autoTipo;
    private String autoColor;
    private Long cantidadComprasRealizadas;
    private String avatar;
    private String fecBirthday;
    private String id;
}
