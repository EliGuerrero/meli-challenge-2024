package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 16/04/2024
 */
@Entity
@Table(name = "tseg_clientes")
@Getter
@Setter
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdidcliente", nullable = false)
    private Long idCliente;
    @Column(name = "dsfec_alta")
    private String fecAlta;
    @Column(name = "dsuser_name", nullable = false)
    private String userName;
    @Column(name = "cdcodigo_zip", nullable = false)
    private String codigoZip;
    @Column(name = "cdcredit_card_num", nullable = false)
    private String creditCardNum;
    @Column(name = "cdcredit_card_ccv", nullable = false)
    private String creditCardCcv;
    @Column(name = "cdcuenta_numero", nullable = false)
    private String cuentaNumero;
    @Column(name = "cddireccion")
    private String direccion;
    @Column(name = "cdgeo_latitud", nullable = false)
    private String geoLatitud;
    @Column(name = "cdgeo_longitud", nullable = false)
    private String geoLongitud;
    @Column(name = "dscolor_favorito")
    private String colorFavorito;
    @Column(name = "dsfoto_dni")
    private String fotoDni;
    @Column(name = "cdip", nullable = false)
    private String ip;
    @Column(name = "cdauto")
    private String auto;
    @Column(name = "dsauto_modelo")
    private String autoModelo;
    @Column(name = "dsauto_tipo")
    private String autoTipo;
    @Column(name = "dsauto_color")
    private String autoColor;
    @Column(name = "nmcantidad_compras_realizadas", nullable = false)
    private Long cantidadComprasRealizadas;
    @Column(name = "dsavatar")
    private String avatar;
    @Column(name = "dsfec_birthday")
    private String fecBirthday;
    @Column(name = "cdid", nullable = false)
    private String id;
}