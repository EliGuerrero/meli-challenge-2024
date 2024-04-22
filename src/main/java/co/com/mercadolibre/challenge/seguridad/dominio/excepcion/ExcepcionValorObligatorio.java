package co.com.mercadolibre.challenge.seguridad.dominio.excepcion;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 21/04/2024
 */
public class ExcepcionValorObligatorio extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionValorObligatorio(String message) {
        super(message);
    }
}