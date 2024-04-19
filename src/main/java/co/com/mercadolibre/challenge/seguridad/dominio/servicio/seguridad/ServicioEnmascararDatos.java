package co.com.mercadolibre.challenge.seguridad.dominio.servicio.seguridad;

import org.springframework.stereotype.Service;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 19/04/2024
 */
@Service
public class ServicioEnmascararDatos {
    public String enmascaraValor(String valor) {
        if (valor == null || valor.length() < 4) {
            return valor;
        }

        int length = valor.length();
        String parteEnmascarada = "*".repeat(length - 4);

        return parteEnmascarada + valor.substring(length - 4);
    }
}