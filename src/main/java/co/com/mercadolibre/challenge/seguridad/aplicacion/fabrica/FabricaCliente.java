package co.com.mercadolibre.challenge.seguridad.aplicacion.fabrica;

import co.com.mercadolibre.challenge.seguridad.aplicacion.comando.ComandoCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Cliente;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Tarjeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 16/04/2024
 */
@Component
public class FabricaCliente {

    @Autowired
    private FabricaTarjeta fabricaTarjeta;

    public Cliente crearCliente(ComandoCliente comandoCliente) {
        List<Tarjeta> tarjetas = new ArrayList<>();
        tarjetas.add(fabricaTarjeta.crearTarjeta(comandoCliente));
        return new Cliente(
                comandoCliente.getIdCliente(), comandoCliente.getUserName(), comandoCliente.getDireccion(),
                comandoCliente.getColorFavorito(), comandoCliente.getFotoDni(), comandoCliente.getAuto(),
                comandoCliente.getAutoModelo(), comandoCliente.getAutoTipo(), comandoCliente.getAutoColor(),
                comandoCliente.getAvatar(), comandoCliente.getFecBirthday(), comandoCliente.getId(), tarjetas);
    }
}