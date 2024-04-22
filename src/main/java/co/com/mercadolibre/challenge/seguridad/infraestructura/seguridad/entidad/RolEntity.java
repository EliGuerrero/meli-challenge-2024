package co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 20/04/2024
 */
@Entity
@Table(name = "tseg_roles")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdidrol", nullable = false)
    Long id;
    @Basic
    @Column(name = "dsnombre", nullable = false, unique = true)
    String nombre;
}