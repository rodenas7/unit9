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
public class test13 {
    private CadenasAlumno c = new CadenasAlumno();
    public test13() {
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
    public void posicionPrimeraCadenaa() {
        String cadena1="Entornos",cadena2="o";
        long b1 = cadena1.indexOf(cadena2);
        long b2 = c.posicionPrimeraCadena(cadena1,cadena2);
        assertEquals(b1,b2);
    }
     @Test
    public void posicionPrimeraCadenab() {
        String cadena1="Entornos",cadena2="o";
        long b1 = cadena1.indexOf(cadena2);
        long b2 = c.posicionPrimeraCadena(cadena1,cadena2);
        assertEquals(b1,b2);
    }
    @Test
    public void posicionPrimeraCadenac() {
        String cadena1="Entornos",cadena2="o";
        long b1 = cadena1.indexOf(cadena2);
        long b2 = c.posicionPrimeraCadena(cadena1,cadena2);
        assertEquals(b1,b2);
    }
    @Test
    public void posicionPrimeraCadenad() {
        String cadena1="Entornos",cadena2="o";
        long b1 = cadena1.indexOf(cadena2);
        long b2 = c.posicionPrimeraCadena(cadena1,cadena2);
        assertEquals(b1,b2);
    }
    
    
}
