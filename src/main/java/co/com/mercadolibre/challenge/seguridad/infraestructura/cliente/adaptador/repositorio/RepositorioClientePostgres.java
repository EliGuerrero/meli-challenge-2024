package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.adaptador.repositorio;


import co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.entidad.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface RepositorioClientePostgres extends JpaRepository<ClienteEntity, Long>
{
    Optional<ClienteEntity> findById(Long id);
}