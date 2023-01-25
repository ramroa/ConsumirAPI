package com.example.consumoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumoController {


    private  final RestTemplate restTemplate;

    @Autowired
    public ConsumoController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/prueba")
    public Object getAPI(){
        String url = "https://jsonplaceholder.typicode.com/posts";
        return  restTemplate.getForObject(url, Object.class);

    }


}
