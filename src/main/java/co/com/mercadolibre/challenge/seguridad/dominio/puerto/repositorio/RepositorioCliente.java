package co.com.mercadolibre.challenge.seguridad.dominio.puerto.repositorio;


import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Cliente;
/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 16/04/2024
 */
public interface RepositorioCliente {
    Long agregar(Cliente cliente);
}