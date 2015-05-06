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
public class test12 {
    private CadenasAlumno c = new CadenasAlumno();
    public test12() {
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
    public void acabaEna() {
        String cadena1="Entornos",cadena2="";
        boolean b1 = cadena1.endsWith(cadena2);
        boolean b2 = c.acabaEn(cadena1,cadena2);
        assertEquals(b1,b2);
    }
     @Test
    public void acabaEnb() {
        String cadena1="Entornos",cadena2="1";
        boolean b1 = cadena1.endsWith(cadena2);
        boolean b2 = c.acabaEn(cadena1,cadena2);
        assertEquals(b1,b2);
    }
     @Test
    public void acabaEnc() {
        String cadena1="Entornos",cadena2="fd";
        boolean b1 = cadena1.endsWith(cadena2);
        boolean b2 = c.acabaEn(cadena1,cadena2);
        assertEquals(b1,b2);
    }
    @Test
    public void acabaEnd() {
        String cadena1="Entornos",cadena2="os";
        boolean b1 = cadena1.endsWith(cadena2);
        boolean b2 = c.acabaEn(cadena1,cadena2);
        assertEquals(b1,b2);
    }
    
    
}
