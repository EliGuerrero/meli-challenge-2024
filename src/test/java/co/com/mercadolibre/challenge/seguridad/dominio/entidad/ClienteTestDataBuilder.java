package co.com.mercadolibre.challenge.seguridad.dominio.entidad;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Cliente;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Tarjeta;

import java.util.List;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 21/04/2024
 */
public class ClienteTestDataBuilder {
    private static final Long IDCLIENTE = 1L;
    private static final String USERNAME = "Pepe";
    private static final String DIRECCION = "Av Siempre Viva";
    private static final String COLORFAVORITO = "Blanco";
    private static final String FOTODNI = "Foto.png";
    private static final String AUTO = "Kia";
    private static final String AUTOMODELO = "Rio";
    private static final String AUTOTIPO = "Hatchback";
    private static final String AUTOCOLOR = "Blanco";
    private static final String AVATAR = "https://Avatar.com";
    private static final String FECBIRTHDAY = "2021-03-29T13:20:05.602Z";
    private static final String ID = "1";
    private static final List<Tarjeta> TARJETAS
            = List.of(new TarjetaTestDataBuilder().conIdTarjeta(1l).build());

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

    public ClienteTestDataBuilder() {
        this.idCliente = IDCLIENTE;
        this.userName = USERNAME;
        this.direccion = DIRECCION;
        this.colorFavorito = COLORFAVORITO;
        this.fotoDni = FOTODNI;
        this.auto = AUTO;
        this.autoModelo = AUTOMODELO;
        this.autoTipo = AUTOTIPO;
        this.autoColor = AUTOCOLOR;
        this.avatar = AVATAR;
        this.fecBirthday = FECBIRTHDAY;
        this.id = ID;
        this.tarjetas = TARJETAS;
    }

    public ClienteTestDataBuilder conIdCliente(Long idCLiente) {
        this.idCliente = idCLiente;
        return this;
    }
    public ClienteTestDataBuilder conUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public Cliente build() {
        return new Cliente(idCliente, userName, direccion, colorFavorito
                , fotoDni, auto, autoModelo, autoTipo, autoColor, avatar, fecBirthday, id, tarjetas);
    }
}