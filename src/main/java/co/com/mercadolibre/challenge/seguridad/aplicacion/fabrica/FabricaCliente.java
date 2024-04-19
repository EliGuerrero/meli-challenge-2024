package co.com.mercadolibre.challenge.seguridad.aplicacion.fabrica;

import co.com.mercadolibre.challenge.seguridad.aplicacion.comando.ComandoCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Cliente;
import org.springframework.stereotype.Component;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 16/04/2024
 */
@Component
public class FabricaCliente {
    public Cliente crearCliente(ComandoCliente comandoCliente) {
        return new Cliente(comandoCliente.getIdCliente(), comandoCliente.getFecAlta()
                , comandoCliente.getUserName(), comandoCliente.getCodigoZip()
                , comandoCliente.getCreditCardNum(), comandoCliente.getCreditCardCcv()
                , comandoCliente.getCuentaNumero(), comandoCliente.getDireccion()
                , comandoCliente.getGeoLatitud(), comandoCliente.getGeoLongitud()
                , comandoCliente.getColorFavorito(), comandoCliente.getFotoDni()
                , comandoCliente.getIp(), comandoCliente.getAuto(), comandoCliente.getAutoModelo()
                , comandoCliente.getAutoTipo(), comandoCliente.getAutoColor()
                , comandoCliente.getCantidadComprasRealizadas(), comandoCliente.getAvatar()
                , comandoCliente.getFecBirthday(), comandoCliente.getId()
        );
    }
}
