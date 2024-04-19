package co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.auntenticacion.usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 18/04/2024
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}