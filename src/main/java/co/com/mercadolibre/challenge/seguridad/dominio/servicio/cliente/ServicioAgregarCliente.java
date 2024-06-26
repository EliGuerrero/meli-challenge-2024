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

    public Cliente validadorDireccion(Cliente cliente) {
        if (!cliente.getDireccion().isEmpty()) {
            cliente.setDireccion(encriptador(cliente.getDireccion()));
        }
        return cliente;
    }

    public Cliente validadorFotoDni(Cliente cliente) {
        if (!cliente.getFotoDni().isEmpty()) {
            cliente.setFotoDni(encriptador(cliente.getFotoDni()));
        }
        return cliente;
    }

    public Cliente manejadorDedatosSensiblesCliente(Cliente cliente) {
        validadorUserName(cliente);
        validadorDireccion(cliente);
        validadorFotoDni(cliente);
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

    public Tarjeta validadorCodigoZip(Tarjeta tarjeta) {
        if (!tarjeta.getCodigoZip().isEmpty()) {
            tarjeta.setCodigoZip(encriptador(tarjeta.getCodigoZip()));
        }
        return tarjeta;
    }

    public Tarjeta validadorFecAlta(Tarjeta tarjeta) {
        if (!tarjeta.getFecAlta().isEmpty()) {
            tarjeta.setFecAlta(encriptador(tarjeta.getFecAlta()));
        }
        return tarjeta;
    }

    public Tarjeta validadorIp(Tarjeta tarjeta) {
        if (!tarjeta.getIp().isEmpty()) {
            tarjeta.setIp(encriptador(tarjeta.getIp()));
        }
        return tarjeta;
    }

    public Tarjeta manejadorDedatosSensiblesTarjeta(Tarjeta tarjeta) {
        validadorCreditCardNum(tarjeta);
        validadorCuentaNumero(tarjeta);
        validadorGeoLatitud(tarjeta);
        validadorCodigoZip(tarjeta);
        validadorGeoLongitud(tarjeta);
        validadorFecAlta(tarjeta);
        validadorIp(tarjeta);
        return tarjeta;
    }
}