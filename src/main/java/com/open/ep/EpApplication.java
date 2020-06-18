package com.open.ep;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EpApplication {

    public static void main(String[] args) {
        SpringApplication.run(EpApplication.class, args);
    }

    @Bean
    // Anotacion de contexto Bean quiere decir que el objeto que se genere va a estar accesible desde cualquier parte
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
