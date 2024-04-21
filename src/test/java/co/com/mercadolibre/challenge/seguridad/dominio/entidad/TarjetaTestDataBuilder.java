package co.com.mercadolibre.challenge.seguridad.dominio.entidad;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Tarjeta;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 21/04/2024
 */
public class TarjetaTestDataBuilder {
    private static final Long IDTARJETA = 1L;
    private static final String CODIGOZIP = "Ana";
    private static final String FECALTA = "2024-04-19";
    private static final String CREDICARDNUM = "123132";
    private static final String CUENTANUMERO = "123456";
    private static final String GEOLATITUD = "37.7749";
    private static final String GEOLONGITUD = "-122.4194";
    private static final String IP = "192.168.1.1";
    private static final Long CANTIDADCOMPRASREALIZADAS = 12L;

    private Long idTarjeta;
    private String codigoZip;
    private String fecAlta;
    private String creditCardNum;
    private String cuentaNumero;
    private String geoLatitud;
    private String geoLongitud;
    private String ip;
    private Long cantidadComprasRealizadas;

    public TarjetaTestDataBuilder() {
        this.idTarjeta = IDTARJETA;
        this.codigoZip = CODIGOZIP;
        this.fecAlta = FECALTA;
        this.creditCardNum = CREDICARDNUM;
        this.cuentaNumero = CUENTANUMERO;
        this.geoLatitud = GEOLATITUD;
        this.geoLongitud = GEOLONGITUD;
        this.ip = IP;
        this.cantidadComprasRealizadas = CANTIDADCOMPRASREALIZADAS;
    }

    public TarjetaTestDataBuilder conIdTarjeta(Long idTarjeta) {
        this.idTarjeta = idTarjeta;
        return this;
    }

    public Tarjeta build() {
        return new Tarjeta(idTarjeta, codigoZip, fecAlta, creditCardNum
                , cuentaNumero, geoLatitud, geoLongitud, ip, cantidadComprasRealizadas);
    }
}