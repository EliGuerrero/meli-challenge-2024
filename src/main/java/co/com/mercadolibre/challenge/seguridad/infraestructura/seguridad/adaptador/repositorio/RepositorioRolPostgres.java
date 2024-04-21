package co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.adaptador.repositorio;

import co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.entidad.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 20/04/2024
 */
@Repository
public interface RepositorioRolPostgres extends JpaRepository<RolEntity, Long> {
}
