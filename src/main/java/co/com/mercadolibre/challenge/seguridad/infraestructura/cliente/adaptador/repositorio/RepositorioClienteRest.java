package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.adaptador.repositorio;

import co.com.mercadolibre.challenge.seguridad.aplicacion.comando.ComandoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 16/04/2024
 */
@Service
public class RepositorioClienteRest {

    @Autowired
    private RestTemplate cliente;

    public List<ComandoCliente> consumirEndpoint() {
        ResponseEntity<ComandoCliente[]> response = cliente.getForEntity("https://62433a7fd126926d0c5d296b.mockapi.io/api/v1/usuarios"
                , ComandoCliente[].class);
        return Arrays.asList(response.getBody());
    }
}