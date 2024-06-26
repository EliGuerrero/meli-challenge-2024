package co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 16/04/2024
 */
@NoArgsConstructor
@Getter
public class DtoCliente {
    private Long idCliente;
    private String userName;
    private String direccion;
    private List<DtoTarjeta> tarjetas;

    public DtoCliente(Long idCliente, String userName, String direccion, List<DtoTarjeta> tarjetas) {
        this.idCliente = idCliente;
        this.userName = userName;
        this.direccion = direccion;
        this.tarjetas = tarjetas;
    }
}