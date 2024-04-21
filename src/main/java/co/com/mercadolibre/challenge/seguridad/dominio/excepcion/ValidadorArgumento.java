package co.com.mercadolibre.challenge.seguridad.dominio.excepcion;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 21/04/2024
 */
public class ValidadorArgumento {

    private ValidadorArgumento() {
        throw new IllegalStateException("Utility class");
    }


    public static void validarObligatorio(Object valor, String mensaje) {
        if (valor == null) {
            throw new ExcepcionValorObligatorio(mensaje);
        }
    }
}