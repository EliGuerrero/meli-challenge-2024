package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.adaptador.dao;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.puerto.dao.DaoCliente;
import co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.adaptador.repositorio.RepositorioClientePostgres;
import co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.builder.ClienteBuilder;
import co.com.mercadolibre.challenge.seguridad.dominio.servicio.seguridad.ServicioEncriptacion;
import co.com.mercadolibre.challenge.seguridad.dominio.servicio.seguridad.ServicioEnmascararDatos;
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
    @Autowired
    private ServicioEncriptacion servicioEncriptacion;
    @Autowired
    private ServicioEnmascararDatos servicioEnmascararDatos;

    @Override
    public List<DtoCliente> listarClientes() {
        return repositorioClientePostgres.findAllByOrderByIdCliente().stream()
                .map(cliente ->
                        ClienteBuilder.convertirADominioDto(
                                cliente,
                                servicioEnmascararDatos.enmascaraValor(servicioEncriptacion.desencriptarValor(cliente.getCreditCardNum())),
                                servicioEncriptacion.desencriptarValor(cliente.getUserName()),
                                servicioEncriptacion.desencriptarValor(cliente.getGeoLatitud()),
                                servicioEncriptacion.desencriptarValor(cliente.getGeoLongitud()),
                                servicioEnmascararDatos.enmascaraValor(servicioEncriptacion.desencriptarValor(cliente.getCuentaNumero()))
                        )
                ).collect(Collectors.toList());
    }
}