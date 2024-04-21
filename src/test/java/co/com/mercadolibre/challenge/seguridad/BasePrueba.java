package co.com.mercadolibre.challenge.seguridad;

import org.junit.jupiter.api.Assertions;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 21/04/2024
 */
public class BasePrueba {
    private static final String PERO_FUE_LANZADA = " Pero fue lanzada ";
    private static final String SE_ESPERABA_LA_EXCEPCION = "Se esperaba la excepcion ";
    private static final String PERO_FUE_LANZADO = " Pero fue lanzado ";
    private static final String SE_ESPERABA_EL_MENSAJE = "Se esperaba el mensaje ";

    public static <T> void assertThrows(Supplier<T> supplier, Class<? extends Exception> exception, String message) {
        try {
            supplier.get();
            fail();
        } catch (Exception e) {
            Assertions.assertTrue(exception.isInstance(e), SE_ESPERABA_LA_EXCEPCION + exception.getCanonicalName() + PERO_FUE_LANZADA
                    + e.getClass().getCanonicalName());
            Assertions.assertEquals(e.getMessage(), message, SE_ESPERABA_EL_MENSAJE + message + PERO_FUE_LANZADO + e.getMessage());
        }
    }
}
