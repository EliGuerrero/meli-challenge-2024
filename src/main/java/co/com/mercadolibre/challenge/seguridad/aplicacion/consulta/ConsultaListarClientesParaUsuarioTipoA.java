package co.com.mercadolibre.challenge.seguridad.aplicacion.consulta;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.puerto.dao.DaoCliente;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 19/04/2024
 */
@Component
public class ConsultaListarClientesParaUsuarioTipoA {

    private final DaoCliente daoCliente;

    public ConsultaListarClientesParaUsuarioTipoA(DaoCliente daoCliente) {
        this.daoCliente = daoCliente;
    }

    public List<DtoCliente> ejecutar() {
        return daoCliente.listarClientesParaUsuarioTipoA();
    }
}