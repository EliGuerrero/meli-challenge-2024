package co.com.mercadolibre.challenge.seguridad.dominio.servicio.seguridad;

import org.springframework.stereotype.Service;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 19/04/2024
 */
@Service
public class ServicioEnmascararDatos {

    private static final int CANTIDAD_DE_DIGITOS_A_MOSTRAR = 4;
    private static final String VALOR_ENMASCARA = "*";

    public String enmascaraValor(String valor) {
        if (valor == null || valor.length() < CANTIDAD_DE_DIGITOS_A_MOSTRAR) {
            return valor;
        }

        int length = valor.length();
        String parteEnmascarada = VALOR_ENMASCARA.repeat(length - CANTIDAD_DE_DIGITOS_A_MOSTRAR);

        return parteEnmascarada + valor.substring(length - CANTIDAD_DE_DIGITOS_A_MOSTRAR);
    }
}