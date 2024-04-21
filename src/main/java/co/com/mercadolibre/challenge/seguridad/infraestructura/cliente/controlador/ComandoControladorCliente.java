package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.controlador;

import co.com.mercadolibre.challenge.seguridad.aplicacion.comando.ComandoCliente;
import co.com.mercadolibre.challenge.seguridad.aplicacion.manejador.ManejadorAgregarCliente;
import co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.adaptador.repositorio.RepositorioClienteRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 16/04/2024
 */
@RestController
@RequestMapping("/api/cliente")
public class ComandoControladorCliente {
    @Autowired
    private ManejadorAgregarCliente manejadorAgregarCliente;

    @Autowired
    private RepositorioClienteRest repositorioClienteRest;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void agregar() {
        List<ComandoCliente> response = repositorioClienteRest.consumirEndpoint();
        response.forEach(cliente -> manejadorAgregarCliente.ejecutar(cliente));
    }
}