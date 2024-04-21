package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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
    @Column(name = "dsuser_name", nullable = false)
    private String userName;
    @Column(name = "cddireccion")
    private String direccion;
    @Column(name = "dscolor_favorito")
    private String colorFavorito;
    @Column(name = "dsfoto_dni")
    private String fotoDni;
    @Column(name = "cdauto")
    private String auto;
    @Column(name = "dsauto_modelo")
    private String autoModelo;
    @Column(name = "dsauto_tipo")
    private String autoTipo;
    @Column(name = "dsauto_color")
    private String autoColor;
    @Column(name = "dsavatar")
    private String avatar;
    @Column(name = "dsfec_birthday")
    private String fecBirthday;
    @Column(name = "cdid", nullable = false)
    private String id;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "cdidcliente")
    private List<TarjetaEntity> tarjetaEntities = new ArrayList<>();
}