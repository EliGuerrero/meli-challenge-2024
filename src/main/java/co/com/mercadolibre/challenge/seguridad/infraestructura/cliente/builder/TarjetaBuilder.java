package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.builder;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoTarjeta;
import co.com.mercadolibre.challenge.seguridad.dominio.modelo.entidad.Tarjeta;
import co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.entidad.TarjetaEntity;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 19/04/2024
 */
public final class TarjetaBuilder {
    private TarjetaBuilder() {
        throw new IllegalStateException("Utility class");
    }

    public static TarjetaEntity convertirAEntity(Tarjeta tarjeta) {
        TarjetaEntity tarjetaEntity = null;
        if (tarjeta != null) {
            tarjetaEntity = new TarjetaEntity();
            tarjetaEntity.setCodigoZip(tarjeta.getCodigoZip());
            tarjetaEntity.setCreditCardNum(tarjeta.getCreditCardNum());
            tarjetaEntity.setCantidadComprasRealizadas(tarjeta.getCantidadComprasRealizadas());
            tarjetaEntity.setFecAlta(tarjeta.getFecAlta());
            tarjetaEntity.setGeoLatitud(tarjeta.getGeoLatitud());
            tarjetaEntity.setGeoLongitud(tarjeta.getGeoLongitud());
            tarjetaEntity.setCuentaNumero(tarjeta.getCuentaNumero());
            tarjetaEntity.setIp(tarjeta.getIp());
        }
        return tarjetaEntity;
    }

    public static DtoTarjeta convertirADtoParaUsuarioTipoA(TarjetaEntity tarjetaEntity, String cuentaNumero, String fecAlta, String creditCardNum) {
        DtoTarjeta dtoTarjeta = null;
        if (tarjetaEntity != null) {
            dtoTarjeta = new DtoTarjeta();
            dtoTarjeta.setIdTarjeta(tarjetaEntity.getIdTarjeta());
            dtoTarjeta.setCodigoZip(tarjetaEntity.getCodigoZip());
            dtoTarjeta.setCreditCardNum(creditCardNum);
            dtoTarjeta.setCantidadComprasRealizadas(tarjetaEntity.getCantidadComprasRealizadas());
            dtoTarjeta.setFecAlta(fecAlta);
            dtoTarjeta.setGeoLatitud(tarjetaEntity.getGeoLatitud());
            dtoTarjeta.setGeoLongitud(tarjetaEntity.getGeoLongitud());
            dtoTarjeta.setCuentaNumero(cuentaNumero);
            dtoTarjeta.setIp(tarjetaEntity.getIp());
        }
        return dtoTarjeta;
    }

    public static DtoTarjeta convertirADtoParaUsuarioTipoB(TarjetaEntity tarjetaEntity, String cuentaNumero, String creditCardNum) {
        DtoTarjeta dtoTarjeta = null;
        if (tarjetaEntity != null) {
            dtoTarjeta = new DtoTarjeta();
            dtoTarjeta.setIdTarjeta(tarjetaEntity.getIdTarjeta());
            dtoTarjeta.setCodigoZip(tarjetaEntity.getCodigoZip());
            dtoTarjeta.setCreditCardNum(creditCardNum);
            dtoTarjeta.setCantidadComprasRealizadas(tarjetaEntity.getCantidadComprasRealizadas());
            dtoTarjeta.setFecAlta(tarjetaEntity.getFecAlta());
            dtoTarjeta.setGeoLatitud(tarjetaEntity.getGeoLatitud());
            dtoTarjeta.setGeoLongitud(tarjetaEntity.getGeoLongitud());
            dtoTarjeta.setCuentaNumero(cuentaNumero);
            dtoTarjeta.setIp(tarjetaEntity.getIp());
        }
        return dtoTarjeta;
    }
}
