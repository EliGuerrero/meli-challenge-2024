package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.controlador;

import co.com.mercadolibre.challenge.seguridad.aplicacion.consulta.ConsultaListarClientesParaUsuarioTipoA;
import co.com.mercadolibre.challenge.seguridad.aplicacion.consulta.ConsultaListarClientesParaUsuarioTipoB;
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
    private final ConsultaListarClientesParaUsuarioTipoA consultaListarClientesParaUsuarioTipoA;
    @Autowired
    private final ConsultaListarClientesParaUsuarioTipoB consultaListarClientesParaUsuarioTipoB;

    public ConsultaControladorCliente(ConsultaListarClientesParaUsuarioTipoA consultaListarClientesParaUsuarioTipoA
            , ConsultaListarClientesParaUsuarioTipoB consultaListarClientesParaUsuarioTipoB) {
        this.consultaListarClientesParaUsuarioTipoA = consultaListarClientesParaUsuarioTipoA;
        this.consultaListarClientesParaUsuarioTipoB = consultaListarClientesParaUsuarioTipoB;
    }


    @GetMapping("usuario-tipoA")
    public List<DtoCliente> consultaListarClientesParaUsuarioTipoA() {
        return consultaListarClientesParaUsuarioTipoA.ejecutar();
    }

    @GetMapping("usuario-tipoB")
    public List<DtoCliente> consultaListarClientesParaUsuarioTipoB() {
        return consultaListarClientesParaUsuarioTipoB.ejecutar();
    }
}