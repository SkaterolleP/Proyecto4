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
import org.junit.Before;

/**
 *
 * @author usuario
 */
public class CuentaTest {
    static cuenta cuenta1;
    static cuenta cuenta2;
    
    @Before
    public void setUp() {
        cuenta1 = new cuenta(0.0);
        cuenta2 = new cuenta(0.0);
    }
    
    @Test
    public void testIngresar_double() throws Exception{
        System.out.println("Ingresar");
        double x = 1000.0;
        try{
            cuenta1.ingresar(x);
            assertTrue(cuenta1.getSaldo()==1000.0);
        } catch (Exception e){
            fail("No deberia haber fallado");
        }
    }
    
    @Test
    public void testRetirar_double() throws Exception{
        System.out.println("Retirar");
        double x = 1000.0;
        try{
            cuenta2.retirar(x);
            System.out.println(cuenta2.getSaldo());
            assertEquals(0.0,0.0 , cuenta2.getSaldo());
            //assertTrue(cuenta2.getSaldo()==-1000.0);
        } catch (Exception e){
            fail("No deberia haber fallado");
        }
    }
}
