/* package com.cibt.catserviceapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable()
            .authorizeHttpRequests((authorize) -> 
                authorize.requestMatchers(HttpMethod.GET).authenticated()
                // authorize.anyRequest().authenticated()
            )
            .httpBasic(Customizer.withDefaults());
        return httpSecurity.build();
    }
} */