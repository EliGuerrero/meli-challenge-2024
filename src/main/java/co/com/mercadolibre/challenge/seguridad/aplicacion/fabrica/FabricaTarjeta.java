package co.com.mercadolibre.challenge.seguridad.aplicacion.fabrica;

import co.com.mercadolibre.challenge.seguridad.aplicacion.comando.ComandoCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Tarjeta;
import org.springframework.stereotype.Component;


/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 19/04/2024
 */
@Component
public class FabricaTarjeta {
    public Tarjeta crearTarjeta(ComandoCliente comandoCliente) {
        return new Tarjeta(
                comandoCliente.getIdCliente(), comandoCliente.getCodigoZip(), comandoCliente.getFecAlta(),
                comandoCliente.getCreditCardNum(), comandoCliente.getCuentaNumero(), comandoCliente.getGeoLatitud(),
                comandoCliente.getGeoLongitud(), comandoCliente.getIp(), comandoCliente.getCantidadComprasRealizadas());
    }
}