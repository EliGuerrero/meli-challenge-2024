package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.adaptador.repositorio;


import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Cliente;
import co.com.mercadolibre.challenge.seguridad.dominio.puerto.repositorio.RepositorioCliente;
import co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.builder.ClienteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 16/04/2024
 */
@Service
public class RepositorioClientePersistente implements RepositorioCliente {
    private static Logger LOGGER = LoggerFactory.getLogger(RepositorioClientePersistente.class);
    @Autowired
    private RepositorioClientePostgres repositorioClientePostgres;

    @Override
    public Long agregar(Cliente cliente) {
        LOGGER.info("Guardando clientes...");
        return repositorioClientePostgres.save(ClienteBuilder.convertirAEntity(cliente)).getIdCliente();
    }
}