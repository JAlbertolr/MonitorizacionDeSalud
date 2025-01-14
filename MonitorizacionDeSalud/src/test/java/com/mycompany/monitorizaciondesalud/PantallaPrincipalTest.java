/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.monitorizaciondesalud;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Informatico
 */
public class PantallaPrincipalTest {
    
    public PantallaPrincipalTest() {
    }

    @Test
    public void testMain() throws Exception {
    }

    @Test
public void testGenerarAleatorio() {
    PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();

    int min = 5;
    int max = 15;
    boolean dentroDelRango = true;

    // Realizar 100 pruebas para verificar que los números generados están dentro del rango
    for (int i = 0; i < 100; i++) {
        int resultado = pantallaPrincipal.generarAleatorio(min, max);
        if (resultado < min || resultado > max) {
            dentroDelRango = false;
            break;
        }
    }

    // Verificar que todos los resultados están dentro del rango
    assertTrue("El método generarAleatorio generó un valor fuera del rango.", dentroDelRango);
}

    
}
