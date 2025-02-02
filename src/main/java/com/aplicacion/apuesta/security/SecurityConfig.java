package com.aplicacion.apuesta.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    private  final SecurityFilter securityFilter;

    public SecurityConfig(SecurityFilter securityFilter) {
        this.securityFilter = securityFilter;
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {


       http.csrf(AbstractHttpConfigurer::disable)
                .sessionManagement(sessiones->sessiones.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                . authorizeHttpRequests(authorize -> authorize.antMatchers("/api/auth/**").permitAll()
                        .anyRequest().authenticated())
                .addFilterBefore(securityFilter ,UsernamePasswordAuthenticationFilter.class)      ;

        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {


          return configuration.getAuthenticationManager();
    }
}
