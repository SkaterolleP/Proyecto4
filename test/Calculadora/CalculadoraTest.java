/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author usuario
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSuma() {
        assertEquals(5, Calculadora.suma(2,3));
    }
    
}
