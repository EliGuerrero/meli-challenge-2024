package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.adaptador.dao;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.puerto.dao.DaoCliente;
import co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.adaptador.repositorio.RepositorioClientePostgres;
import co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.builder.ClienteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 19/04/2024
 */
@Repository
public class DaoClientePostgres implements DaoCliente {
    @Autowired
    private RepositorioClientePostgres repositorioClientePostgres;


    @Override
    public List<DtoCliente> listarClientes() {
        return repositorioClientePostgres.findAllByOrderByUserName().stream()
                .map(ClienteBuilder::convertirADominioDto).collect(Collectors.toList());
    }
}