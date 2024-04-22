package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.adaptador.dao;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoInfoCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.puerto.dao.DaoCliente;
import co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.adaptador.repositorio.RepositorioClientePostgres;
import co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.builder.ClienteBuilder;
import co.com.mercadolibre.challenge.seguridad.dominio.servicio.seguridad.ServicioEncriptacion;
import co.com.mercadolibre.challenge.seguridad.dominio.servicio.seguridad.ServicioEnmascararDatos;
import co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.builder.TarjetaBuilder;
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
    public List<DtoInfoCliente> listarClientesParaUsuarioTipoA() {
        return repositorioClientePostgres.findAllByOrderByIdCliente().stream()
                .map(cliente ->
                        ClienteBuilder.convertirADtoParaUsuarioTipoA(
                                cliente,
                                servicioEncriptacion.desencriptarValor(cliente.getUserName()),
                                servicioEncriptacion.desencriptarValor(cliente.getDireccion()),
                                cliente.getTarjetaEntities().stream().map(
                                        tarjetaEntity ->
                                                TarjetaBuilder.convertirADtoParaUsuarioTipoA(
                                                        tarjetaEntity,
                                                        servicioEncriptacion.desencriptarValor(tarjetaEntity.getCuentaNumero()),
                                                        servicioEnmascararDatos.enmascaraValor(servicioEncriptacion.desencriptarValor(tarjetaEntity.getCreditCardNum()))
                                                )
                                ).collect(Collectors.toList())
                        )
                ).collect(Collectors.toList());
    }

    @Override
    public List<DtoCliente> listarClientesParaUsuarioTipoB() {
        return repositorioClientePostgres.findAllByOrderByIdCliente().stream()
                .map(cliente ->
                        ClienteBuilder.convertirADtoParaUsuarioTipoB(
                                cliente,
                                servicioEncriptacion.desencriptarValor(cliente.getUserName()),
                                servicioEncriptacion.desencriptarValor(cliente.getDireccion()),
                                cliente.getTarjetaEntities().stream().map(
                                        tarjetaEntity ->
                                                TarjetaBuilder.convertirADtoParaUsuarioTipoB(
                                                        tarjetaEntity
                                                )
                                ).collect(Collectors.toList())
                        )
                ).collect(Collectors.toList());
    }
}