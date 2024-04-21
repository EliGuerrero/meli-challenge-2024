package co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static co.com.mercadolibre.challenge.seguridad.dominio.excepcion.ValidadorArgumento.validarObligatorio;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 16/04/2024
 */
@Getter
@Setter
@NoArgsConstructor
public class Cliente {
    private static Logger LOGGER = LoggerFactory.getLogger(Cliente.class);
    private static final String SE_DEBE_INGRESAR_EL_NOMBRE = "Se debe ingresar el nombre del cliente.";
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

    public Cliente(Long idCliente, String userName, String direccion, String colorFavorito
            , String fotoDni, String auto, String autoModelo, String autoTipo, String autoColor
            , String avatar, String fecBirthday, String id, List<Tarjeta> tarjetas) {
        this.idCliente = idCliente;
        validarObligatorio(userName, SE_DEBE_INGRESAR_EL_NOMBRE);
        LOGGER.error(SE_DEBE_INGRESAR_EL_NOMBRE);
        this.userName = userName;
        this.direccion = direccion;
        this.colorFavorito = colorFavorito;
        this.fotoDni = fotoDni;
        this.auto = auto;
        this.autoModelo = autoModelo;
        this.autoTipo = autoTipo;
        this.autoColor = autoColor;
        this.avatar = avatar;
        this.fecBirthday = fecBirthday;
        this.id = id;
        this.tarjetas = tarjetas;
    }
}