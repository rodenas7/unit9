/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import unit9.CadenasAlumno;

/**
 *
 * @author Alvaro
 */
public class test15 {
    private CadenasAlumno c = new CadenasAlumno();
    public test15() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void concatenaCadenasA() {
        String cadena1="Entornos",cadena2="de desarrollo";
        String b1 = cadena1.concat(cadena2);
        String b2 = c.concatenaCadenasConcat(cadena1,cadena2);
        assertEquals(b1,b2);
    }
     @Test
    public void concatenaCadenasB() {
        String cadena1=" Entornos ",cadena2=" programacion";
        String b1 = cadena1.concat(cadena2);
        String b2 = c.concatenaCadenasConcat(cadena1,cadena2);
        assertEquals(b1,b2);
    }
     @Test
     public void concatenaCadenasC() {
        String cadena1="Entornos",cadena2="";
        String b1 = cadena1.concat(cadena2);
        String b2 = c.concatenaCadenasConcat(cadena1,cadena2);
        assertEquals(b1,b2);
    }
      @Test
     public void concatenaCadenasD() {
        String cadena1="",cadena2="de desarrollo";
        String b1 = cadena1.concat(cadena2);
        String b2 = c.concatenaCadenasConcat(cadena1,cadena2);
        assertEquals(b1,b2);
    }
    
    
}
