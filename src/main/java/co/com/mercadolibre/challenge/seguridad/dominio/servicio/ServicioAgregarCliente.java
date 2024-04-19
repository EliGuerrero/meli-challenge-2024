package co.com.mercadolibre.challenge.seguridad.dominio.servicio;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Cliente;
import co.com.mercadolibre.challenge.seguridad.dominio.puerto.repositorio.RepositorioCliente;
import co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.encrypt.EncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 16/04/2024
 */
@Service
public class ServicioAgregarCliente {
    @Autowired
    private RepositorioCliente repositorioCliente;
    @Autowired
    private EncryptionService encryptionService;

    public Long ejecutar(Cliente cliente) {
        Cliente clienteSeguro = manejadorDedatosSensibles(cliente);
        return repositorioCliente.agregar(clienteSeguro);
    }

    public String encriptador(String valor) {
        return encryptionService.encrypt(valor);
    }

    public Cliente manejadorDedatosSensibles(Cliente cliente) {
        if (!cliente.getCreditCardNum().isEmpty()) {
            cliente.setCreditCardNum(encriptador(cliente.getCreditCardNum()));
        }
        return cliente;
    }
}