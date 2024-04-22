package co.com.mercadolibre.challenge.seguridad.dominio.puerto.dao;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoInfoCliente;

import java.util.List;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 19/04/2024
 */
public interface DaoCliente {
    List<DtoInfoCliente> listarClientesParaUsuarioTipoA();

    List<DtoCliente> listarClientesParaUsuarioTipoB();
}