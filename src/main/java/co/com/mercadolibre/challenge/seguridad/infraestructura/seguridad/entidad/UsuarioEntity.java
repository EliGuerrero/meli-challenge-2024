package co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.entidad;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 18/04/2024
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Table(name = "tseg_usuarios", uniqueConstraints = {@UniqueConstraint(columnNames = {"dsnombre"})})
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdidusuario", nullable = false)
    Integer id;

    @Column(name = "dsnombre", nullable = false)
    String username;

    @Column(name = "password", nullable = false)
    String password;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "tseg_usuarios_roles",
            joinColumns = @JoinColumn(name = "cdidusuario"),
            inverseJoinColumns = @JoinColumn(name = "cdidrol")
    )
    private List<RolEntity> roles;
}