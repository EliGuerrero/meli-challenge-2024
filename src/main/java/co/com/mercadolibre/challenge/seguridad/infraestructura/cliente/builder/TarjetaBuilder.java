package co.com.mercadolibre.challenge.seguridad.infraestructura.cliente.builder;

import co.com.mercadolibre.challenge.seguridad.dominio.modelo.dto.DtoInfoTarjeta;
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

    public static DtoInfoTarjeta convertirADtoParaUsuarioTipoA(TarjetaEntity tarjetaEntity, String creditCardNum
            , String cuentaNumero) {
        DtoInfoTarjeta dtoInfoTarjeta = null;
        if (tarjetaEntity != null) {
            dtoInfoTarjeta = new DtoInfoTarjeta(
                    tarjetaEntity.getIdTarjeta(),
                    creditCardNum,
                    cuentaNumero,
                    tarjetaEntity.getCantidadComprasRealizadas());
        }
        return dtoInfoTarjeta;
    }

    public static DtoTarjeta convertirADtoParaUsuarioTipoB(TarjetaEntity tarjetaEntity) {
        DtoTarjeta dtoTarjeta = null;
        if (tarjetaEntity != null) {
            dtoTarjeta = new DtoTarjeta(tarjetaEntity.getIdTarjeta(),
                    tarjetaEntity.getCantidadComprasRealizadas());
        }
        return dtoTarjeta;
    }
}
