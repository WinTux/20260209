package com.pepe.simple_servidor.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PruebaController {
    @GetMapping("/saludo")
    public String unEndpoint(){
        return "Hola desde el endpoint /api/v1/saludo";
    }
}
