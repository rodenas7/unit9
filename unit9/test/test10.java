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
 * @author Alvaro P
 */
public class test10 {
    private CadenasAlumno c = new CadenasAlumno();
    public test10() {
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
    public void longitudCadenaa() {
        String cadena1="EnTornOS";
        long b1 = cadena1.length();
        long b2 = c.longitudCadena(cadena1);
        assertEquals(b1,b2);
    }
    @Test
    public void longitudCadenab() {
        String cadena1="lenguaje de marcas";
        long b1 = cadena1.length();
        long b2 = c.longitudCadena(cadena1);
        assertEquals(b1,b2);
    }
    @Test
    public void longitudCadenac() {
        String cadena1="base de datos";
        long b1 = cadena1.length();
        long b2 = c.longitudCadena(cadena1);
        assertEquals(b1,b2);
    }
    @Test
    public void longitudCadenad() {
        String cadena1="programacion";
        long b1 = cadena1.length();
        long b2 = c.longitudCadena(cadena1);
        assertEquals(b1,b2);
    }
    
}
