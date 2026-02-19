package com.pepe.simple_servidor;

import com.pepe.simple_servidor.Controllers.PruebaController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PruebaControllerTest {
    @Test
    void testUnEndpoint(){
        PruebaController pruebaController = new PruebaController();
        String respuesta = pruebaController.hola();
        assertEquals("Hola, buenas noches",respuesta);
    }
}
