package co.com.mercadolibre.challenge.seguridad.dominio.servicio.cliente;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Cliente;
import co.com.mercadolibre.challenge.seguridad.dominio.puerto.repositorio.RepositorioCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.servicio.seguridad.ServicioEncriptacion;
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
    private ServicioEncriptacion servicioEncriptacion;

    public Long ejecutar(Cliente cliente) {
        Cliente clienteSeguro = manejadorDedatosSensibles(cliente);
        return repositorioCliente.agregar(clienteSeguro);
    }

    public String encriptador(String valor) {
        return servicioEncriptacion.encriptarValor(valor);
    }

    public Cliente validadorCreditCardNum(Cliente cliente) {
        if (!cliente.getCreditCardNum().isEmpty()) {
            cliente.setCreditCardNum(encriptador(cliente.getCreditCardNum()));
        }
        return cliente;
    }

    public Cliente validadorCuentaNumero(Cliente cliente) {
        if (!cliente.getCuentaNumero().isEmpty()) {
            cliente.setCuentaNumero(encriptador(cliente.getCuentaNumero()));
        }
        return cliente;
    }

    public Cliente validadorGeoLongitud(Cliente cliente) {
        if (!cliente.getGeoLongitud().isEmpty()) {
            cliente.setGeoLongitud(encriptador(cliente.getGeoLongitud()));
        }
        return cliente;
    }

    public Cliente validadorGeoLatitud(Cliente cliente) {
        if (!cliente.getGeoLatitud().isEmpty()) {
            cliente.setGeoLatitud(encriptador(cliente.getGeoLatitud()));
        }
        return cliente;
    }

    public Cliente validadorUserName(Cliente cliente) {
        if (!cliente.getUserName().isEmpty()) {
            cliente.setUserName(encriptador(cliente.getUserName()));
        }
        return cliente;
    }

    public Cliente manejadorDedatosSensibles(Cliente cliente) {
        validadorUserName(cliente);
        validadorCreditCardNum(cliente);
        validadorCuentaNumero(cliente);
        validadorGeoLatitud(cliente);
        validadorGeoLongitud(cliente);
        return cliente;
    }
}