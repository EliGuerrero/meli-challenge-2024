package co.com.mercadolibre.challenge.seguridad.aplicacion.manejador;

import co.com.mercadolibre.challenge.seguridad.aplicacion.comando.ComandoCliente;
import co.com.mercadolibre.challenge.seguridad.aplicacion.fabrica.FabricaCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Cliente;
import co.com.mercadolibre.challenge.seguridad.dominio.servicio.cliente.ServicioAgregarCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 16/04/2024
 */
@Component
public class ManejadorAgregarCliente {
    @Autowired
    private FabricaCliente fabricaCliente;
    @Autowired
    private ServicioAgregarCliente servicioAgregarCliente;

    public Long ejecutar(ComandoCliente comandoCliente) {
        Cliente cliente = fabricaCliente.crearCliente(comandoCliente);
        return servicioAgregarCliente.ejecutar(cliente);
    }
}