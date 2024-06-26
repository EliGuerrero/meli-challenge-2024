package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.builder;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoInfoCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoInfoTarjeta;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoTarjeta;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Cliente;
import co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.entidad.ClienteEntity;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 17/04/2024
 */
public final class ClienteBuilder {

    private ClienteBuilder() {
        throw new IllegalStateException("Utility class");
    }

    public static ClienteEntity convertirAEntity(Cliente cliente) {
        ClienteEntity clienteEntity = null;
        if (cliente != null) {
            clienteEntity = new ClienteEntity();
            clienteEntity.setIdCliente(cliente.getIdCliente());
            clienteEntity.setUserName(cliente.getUserName());
            clienteEntity.setDireccion(cliente.getDireccion());
            clienteEntity.setColorFavorito(cliente.getColorFavorito());
            clienteEntity.setFotoDni(cliente.getFotoDni());
            clienteEntity.setAuto(cliente.getAuto());
            clienteEntity.setAutoModelo(cliente.getAutoModelo());
            clienteEntity.setAutoTipo(cliente.getAutoTipo());
            clienteEntity.setAutoColor(cliente.getAutoColor());
            clienteEntity.setAvatar(cliente.getAvatar());
            clienteEntity.setFecBirthday(cliente.getFecBirthday());
            clienteEntity.setId(cliente.getId());
            clienteEntity.setTarjetaEntities(cliente.getTarjetas().stream().map(TarjetaBuilder::convertirAEntity).collect(Collectors.toList()));
        }
        return clienteEntity;
    }

    public static DtoInfoCliente convertirADtoParaUsuarioTipoA(
            ClienteEntity clienteEntity, String nombreUsuario, String direccion, List<DtoInfoTarjeta> tarjetas
    ) {
        DtoInfoCliente dtoInfoCliente = null;
        if (clienteEntity != null) {
            dtoInfoCliente = new DtoInfoCliente(clienteEntity.getIdCliente()
                    , nombreUsuario
                    , direccion
                    , clienteEntity.getFecBirthday()
                    , tarjetas);
        }
        return dtoInfoCliente;
    }

    public static DtoCliente convertirADtoParaUsuarioTipoB(
            ClienteEntity clienteEntity, String nombreUsuario, String direccion, List<DtoTarjeta> tarjetas
    ) {
        DtoCliente dtoCliente = null;
        if (clienteEntity != null) {
            dtoCliente = new DtoCliente(clienteEntity.getIdCliente()
                    , nombreUsuario
                    , direccion
                    , tarjetas);
        }
        return dtoCliente;
    }
}