package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@SpringBootApplication
public class SpringJwtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtDemoApplication.class, args);
	}
	
	
	
	/*
	 
	 da testare con una post con body 
	 {
    "username" : "foo",
    "password" : "foo"
	 }
	 
	 (è la struttura del mio oggetto AuthenticationRequest)
	 su endpoint /authenticate
	 
	 la risposta è un token jwt
	 che farà parte delle future request del client (nell header)
	 la mia app dovra intercettare questo token nelle sue future richieste e validarlo
	 (usando JwtRequestFilter)
	 
	 
	 */

}

