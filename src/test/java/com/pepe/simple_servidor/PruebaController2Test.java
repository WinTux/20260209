package com.pepe.simple_servidor;

import com.pepe.simple_servidor.Controllers.PruebaController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestPropertySource(properties = "spring.datasource.password=ABC")
public class PruebaController2Test {
    @Autowired
    private PruebaController pruebaController;
    @Test
    public void SaludoEndpoint(){
        String respuesta = pruebaController.unEndpoint();
        assertEquals("Hola desde el endpoint /api/v1/saludo: ABC",  respuesta);
    }
}
