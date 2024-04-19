package co.com.mercadolibre.challenge.seguridad.dominio.servicio;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Cliente;
import co.com.mercadolibre.challenge.seguridad.dominio.puerto.repositorio.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioAgregarCliente {
    @Autowired
    private RepositorioCliente repositorioCliente;

    public Long ejecutar(Cliente cliente) {
        return repositorioCliente.agregar(cliente);
    }
}