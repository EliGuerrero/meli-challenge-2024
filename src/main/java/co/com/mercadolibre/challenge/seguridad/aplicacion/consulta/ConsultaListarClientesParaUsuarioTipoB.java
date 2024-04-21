package co.com.mercadolibre.challenge.seguridad.aplicacion.consulta;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.puerto.dao.DaoCliente;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 20/04/2024
 */
@Component
public class ConsultaListarClientesParaUsuarioTipoB {

    private final DaoCliente daoCliente;

    public ConsultaListarClientesParaUsuarioTipoB(DaoCliente daoCliente) {
        this.daoCliente = daoCliente;
    }

    public List<DtoCliente> ejecutar() {
        return daoCliente.listarClientesParaUsuarioTipoB();
    }
}