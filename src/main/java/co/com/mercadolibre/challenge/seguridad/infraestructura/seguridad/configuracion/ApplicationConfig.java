package co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.configuracion;

import co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.adaptador.repositorio.RepositorioUsuarioPostgres;
import co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.auth.CustomUserDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


import lombok.RequiredArgsConstructor;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 18/04/2024
 */
@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {
    private final RepositorioUsuarioPostgres repositorioUsuarioPostgres;

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailService() {
        return username -> new CustomUserDetails(repositorioUsuarioPostgres.findByUsername(username));
    }
}