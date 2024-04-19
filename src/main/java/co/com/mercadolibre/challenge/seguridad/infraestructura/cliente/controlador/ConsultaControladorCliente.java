package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.controlador;

import co.com.mercadolibre.challenge.seguridad.aplicacion.consulta.ConsultaListarClientes;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 19/04/2024
 */
@RestController
@RequestMapping("/api/cliente")
public class ConsultaControladorCliente {
    @Autowired
    private final ConsultaListarClientes consultaListarCliente;

    public ConsultaControladorCliente(ConsultaListarClientes consultaListarCliente) {
        this.consultaListarCliente = consultaListarCliente;
    }

    @GetMapping()
    public List<DtoCliente> listarClientes() {
        return consultaListarCliente.ejecutar();
    }
}