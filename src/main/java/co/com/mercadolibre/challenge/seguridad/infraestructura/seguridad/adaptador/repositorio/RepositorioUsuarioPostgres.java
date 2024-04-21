package co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.adaptador.repositorio;

import co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.entidad.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 18/04/2024
 */
@Repository
public interface RepositorioUsuarioPostgres extends JpaRepository<UsuarioEntity, Integer> {
    UsuarioEntity findByUsername(String nombreUsuario);
}

