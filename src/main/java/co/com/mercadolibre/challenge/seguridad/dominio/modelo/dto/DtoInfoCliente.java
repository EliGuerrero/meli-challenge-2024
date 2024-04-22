package co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 21/04/2024
 */
@NoArgsConstructor
@Getter
public class DtoInfoCliente {
    private Long idCliente;
    private String userName;
    private String direccion;
    private String fecBirthday;
    private List<DtoInfoTarjeta> dtoInfoTarjetas;


    public DtoInfoCliente(Long idCliente, String userName, String direccion, String fecBirthday, List<DtoInfoTarjeta> dtoInfoTarjetas) {
        this.idCliente = idCliente;
        this.userName = userName;
        this.direccion = direccion;
        this.fecBirthday = fecBirthday;
        this.dtoInfoTarjetas = dtoInfoTarjetas;
    }

}