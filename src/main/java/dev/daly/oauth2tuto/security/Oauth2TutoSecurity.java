package dev.daly.oauth2tuto.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Oauth2TutoSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.
                csrf()
                .disable()
                .authorizeHttpRequests()
                .anyRequest()
                .authenticated()
                .and()
                .oauth2Login()
                .and()
                .build();
    }
}
