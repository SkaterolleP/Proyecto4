/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class CuentaTest {
    
    public CuentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testIngresar_double() throws Exception{
        System.out.println("Ingresar");
        double x = 1000.0;
        try{
            cuenta.ingresar(x);
            assertTrue(cuenta.getsaldo()==1000.0);
        } catch (Exception e){
            fail("No deberia haber fallado");
        }
    }
    
    @Test
    public void testRetirar_double() throws Exception{
        System.out.println("Retirar");
        double x = 1000.0;
        try{
            cuenta.retirar(x);
        } catch (Exception e){
            fail("No deberia haber fallado");
        }
        assertEquals(0.0, cuenta.getSaldo());
    }
}
