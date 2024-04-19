package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.builder;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Cliente;
import co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.entidad.ClienteEntity;

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
            clienteEntity.setFecAlta(cliente.getFecAlta());
            clienteEntity.setUserName(cliente.getUserName());
            clienteEntity.setCodigoZip(cliente.getCodigoZip());
            clienteEntity.setCreditCardNum(cliente.getCreditCardNum());
            clienteEntity.setCuentaNumero(cliente.getCuentaNumero());
            clienteEntity.setDireccion(cliente.getDireccion());
            clienteEntity.setGeoLatitud(cliente.getGeoLatitud());
            clienteEntity.setGeoLongitud(cliente.getGeoLongitud());
            clienteEntity.setColorFavorito(cliente.getColorFavorito());
            clienteEntity.setFotoDni(cliente.getFotoDni());
            clienteEntity.setIp(cliente.getIp());
            clienteEntity.setAuto(cliente.getAuto());
            clienteEntity.setAutoModelo(cliente.getAutoModelo());
            clienteEntity.setAutoTipo(cliente.getAutoTipo());
            clienteEntity.setAutoColor(cliente.getAutoColor());
            clienteEntity.setCantidadComprasRealizadas(cliente.getCantidadComprasRealizadas());
            clienteEntity.setAvatar(cliente.getAvatar());
            clienteEntity.setFecBirthday(cliente.getFecBirthday());
            clienteEntity.setId(cliente.getId());
        }
        return clienteEntity;
    }

    public static DtoCliente convertirADominioDto(
            ClienteEntity clienteEntity, String numeroTarjetaCredito, String nombreUsuario, String geoLatitud
            , String geoLongitud, String numeroCuenta
    ) {
        DtoCliente dtoCliente = null;
        if (clienteEntity != null) {
            dtoCliente = new DtoCliente(clienteEntity.getIdCliente(), clienteEntity.getFecAlta()
                    , nombreUsuario, clienteEntity.getCodigoZip()
                    , numeroTarjetaCredito, numeroCuenta, clienteEntity.getDireccion()
                    , geoLatitud, geoLongitud
                    , clienteEntity.getColorFavorito(), clienteEntity.getFotoDni()
                    , clienteEntity.getIp(), clienteEntity.getAuto(), clienteEntity.getAutoModelo()
                    , clienteEntity.getAutoTipo(), clienteEntity.getAutoColor()
                    , clienteEntity.getCantidadComprasRealizadas(), clienteEntity.getAvatar(),
                    clienteEntity.getFecBirthday(), clienteEntity.getId());
        }
        return dtoCliente;
    }
}