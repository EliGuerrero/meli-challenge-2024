package co.com.mercadolibre.challenge.seguridad.infraestructura.usuario.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 19/04/2024
 */
@Entity
@Table(name = "tseg_tarjetas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TarjetaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdidtarjeta", nullable = false)
    private Long idTarjeta;
    @Column(name = "dsfec_alta")
    private String fecAlta;
    @Column(name = "cdcodigo_zip", nullable = false)
    private String codigoZip;
    @Column(name = "cdcredit_card_num", nullable = false)
    private String creditCardNum;
    @Column(name = "cdcuenta_numero", nullable = false)
    private String cuentaNumero;
    @Column(name = "cdgeo_latitud", nullable = false)
    private String geoLatitud;
    @Column(name = "cdgeo_longitud", nullable = false)
    private String geoLongitud;
    @Column(name = "cdip", nullable = false)
    private String ip;
    @Column(name = "nmcantidad_compras_realizadas", nullable = false)
    private Long cantidadComprasRealizadas;
    @Column(name = "cdidcliente")
    private Long idCliente;
}
