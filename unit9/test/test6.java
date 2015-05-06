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
public class test6 {
    private CadenasAlumno c = new CadenasAlumno();
    public test6() {
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
    public void reemplazaPrimero() {
        String cadena1="entornos", cadena2="o", cambio="e";
        String b1 = cadena1.replaceFirst(cadena2, cambio);
        String b2 = c.reemplazaPrimero(cadena1,cadena2,cambio);
        assertEquals(b1,b2);
    }
    
}
