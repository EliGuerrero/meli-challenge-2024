package co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 16/04/2024
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private Long idCliente;
    private String userName;
    private String direccion;
    private String colorFavorito;
    private String fotoDni;
    private String auto;
    private String autoModelo;
    private String autoTipo;
    private String autoColor;
    private String avatar;
    private String fecBirthday;
    private String id;
    private List<Tarjeta> tarjetas;
}