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
            clienteEntity.setCreditCardCcv(cliente.getCreditCardCcv());
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

    public static Cliente convertirADominio(ClienteEntity clienteEntity) {
        Cliente cliente = null;
        if (clienteEntity != null) {
            cliente = new Cliente(clienteEntity.getIdCliente()
                    , clienteEntity.getFecAlta()
                    , clienteEntity.getUserName(), clienteEntity.getCodigoZip()
                    , clienteEntity.getCreditCardNum(), clienteEntity.getCreditCardCcv()
                    , clienteEntity.getCuentaNumero(), clienteEntity.getDireccion()
                    , clienteEntity.getGeoLatitud(), clienteEntity.getGeoLongitud()
                    , clienteEntity.getColorFavorito(), clienteEntity.getFotoDni()
                    , clienteEntity.getIp(), clienteEntity.getAuto(), clienteEntity.getAutoModelo()
                    , clienteEntity.getAutoTipo(), clienteEntity.getAutoColor()
                    , clienteEntity.getCantidadComprasRealizadas(), clienteEntity.getAvatar(),
                    clienteEntity.getFecBirthday(), clienteEntity.getId());
        }
        return cliente;
    }

    public static DtoCliente convertirADominioDto(ClienteEntity clienteEntity) {
        DtoCliente dtoCliente = null;
        if (clienteEntity != null) {
            dtoCliente = new DtoCliente(clienteEntity.getIdCliente(), clienteEntity.getFecAlta()
                    , clienteEntity.getUserName(), clienteEntity.getCodigoZip()
                    , clienteEntity.getCreditCardNum(), clienteEntity.getCreditCardCcv()
                    , clienteEntity.getCuentaNumero(), clienteEntity.getDireccion()
                    , clienteEntity.getGeoLatitud(), clienteEntity.getGeoLongitud()
                    , clienteEntity.getColorFavorito(), clienteEntity.getFotoDni()
                    , clienteEntity.getIp(), clienteEntity.getAuto(), clienteEntity.getAutoModelo()
                    , clienteEntity.getAutoTipo(), clienteEntity.getAutoColor()
                    , clienteEntity.getCantidadComprasRealizadas(), clienteEntity.getAvatar(),
                    clienteEntity.getFecBirthday(), clienteEntity.getId());
        }
        return dtoCliente;
    }
}
