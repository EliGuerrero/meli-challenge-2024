package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.adaptador.repositorio;

import co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.entidad.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 19/04/2024
 */
@Repository
public interface RepositorioClientePostgres extends JpaRepository<ClienteEntity, Long> {
    List<ClienteEntity> findAllByOrderByIdCliente();
}