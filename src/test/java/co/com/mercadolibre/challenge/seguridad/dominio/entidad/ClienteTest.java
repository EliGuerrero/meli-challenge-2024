package co.com.mercadolibre.challenge.seguridad.dominio.entidad;

import co.com.mercadolibre.challenge.seguridad.dominio.excepcion.ExcepcionValorObligatorio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 21/04/2024
 */
@SpringBootTest
class ClienteTest {

private static final String SE_DEBE_INGRESAR_EL_NOMBRE = "Se debe ingresar el nombre del cliente.";
    @DisplayName("Debe fallar al crear un cliente con username nulo")
    @Test
    void crearClienteFallidoSinUserNameTest() {
        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder()
                .conUserName(null);
        //Act - Assert
        Assertions.assertThrows(ExcepcionValorObligatorio.class, () -> clienteTestDataBuilder.build());
    }
}