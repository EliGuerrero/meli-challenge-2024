package co.com.mercadolibre.challenge.seguridad.dominio.servicio.cliente;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Cliente;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Tarjeta;
import co.com.mercadolibre.challenge.seguridad.dominio.puerto.repositorio.RepositorioCliente;
import co.com.mercadolibre.challenge.seguridad.dominio.servicio.seguridad.ServicioEncriptacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

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
        Cliente clienteSeguro = manejadorDedatosSensiblesCliente(cliente);
        clienteSeguro.getTarjetas().stream().map(tarjeta -> manejadorDedatosSensiblesTarjeta(tarjeta)).collect(Collectors.toList());
        return repositorioCliente.agregar(clienteSeguro);
    }

    public String encriptador(String valor) {
        return servicioEncriptacion.encriptarValor(valor);
    }


    public Cliente validadorUserName(Cliente cliente) {
        if (!cliente.getUserName().isEmpty()) {
            cliente.setUserName(encriptador(cliente.getUserName()));
        }
        return cliente;
    }

    public Cliente manejadorDedatosSensiblesCliente(Cliente cliente) {
        validadorUserName(cliente);
        return cliente;
    }

    public Tarjeta validadorCreditCardNum(Tarjeta tarjeta) {
        if (!tarjeta.getCreditCardNum().isEmpty()) {
            tarjeta.setCreditCardNum(encriptador(tarjeta.getCreditCardNum()));
        }
        return tarjeta;
    }

    public Tarjeta validadorCuentaNumero(Tarjeta tarjeta) {
        if (!tarjeta.getCuentaNumero().isEmpty()) {
            tarjeta.setCuentaNumero(encriptador(tarjeta.getCuentaNumero()));
        }
        return tarjeta;
    }

    public Tarjeta validadorGeoLongitud(Tarjeta tarjeta) {
        if (!tarjeta.getGeoLongitud().isEmpty()) {
            tarjeta.setGeoLongitud(encriptador(tarjeta.getGeoLongitud()));
        }
        return tarjeta;
    }

    public Tarjeta validadorGeoLatitud(Tarjeta tarjeta) {
        if (!tarjeta.getGeoLatitud().isEmpty()) {
            tarjeta.setGeoLatitud(encriptador(tarjeta.getGeoLatitud()));
        }
        return tarjeta;
    }

    public Tarjeta manejadorDedatosSensiblesTarjeta(Tarjeta tarjeta) {
        validadorCreditCardNum(tarjeta);
        validadorCuentaNumero(tarjeta);
        validadorGeoLatitud(tarjeta);
        validadorGeoLongitud(tarjeta);
        return tarjeta;
    }
}