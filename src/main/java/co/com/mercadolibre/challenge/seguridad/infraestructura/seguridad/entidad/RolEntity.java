package co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

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