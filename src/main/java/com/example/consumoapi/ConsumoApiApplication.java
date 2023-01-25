package com.example.consumoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumoApiApplication.class, args);
    }


    //crea un bean que nos regresa un RestTemplate
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
