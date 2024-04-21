package co.com.mercadolibre.challenge.seguridad.aplicacion.comando;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ComandoRol {
    private String nombre;
    private Long id;
}
