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
public class test14 {
    private CadenasAlumno c = new CadenasAlumno();
    public test14() {
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
    public void extraerSubstring2posicionesA() {
        String cadena1="Entornos";
        int cadena2=3;
        String b1 = cadena1.substring(cadena2);
        String b2 = c.extraerSubstring(cadena1,cadena2);
        assertEquals(b1,b2);
    }
    @Test
    public void extraerSubstring3posicionesA() {
        String cadena1="Entornos";
        int cadena2=3, cadena3=5;
        String b1 = cadena1.substring(cadena2,cadena3);
        String b2 = c.extraerSubstring(cadena1,cadena2,cadena3);
        assertEquals(b1,b2);
    }
    @Test
    public void extraerSubstring2posicionesB() {
        String cadena1="Programacion";
        int cadena2=1;
        String b1 = cadena1.substring(cadena2);
        String b2 = c.extraerSubstring(cadena1,cadena2);
        assertEquals(b1,b2);
    }
    @Test
    public void extraerSubstring3posicionesB() {
        String cadena1="Programacion";
        int cadena2=0, cadena3=4;
        String b1 = cadena1.substring(cadena2,cadena3);
        String b2 = c.extraerSubstring(cadena1,cadena2,cadena3);
        assertEquals(b1,b2);
    }
    @Test
    public void extraerSubstring2posicionesC() {
        String cadena1="Lenguaje de marcas";
        int cadena2=6;
        String b1 = cadena1.substring(cadena2);
        String b2 = c.extraerSubstring(cadena1,cadena2);
        assertEquals(b1,b2);
    }
    @Test
    public void extraerSubstring3posicionesC() {
        String cadena1="Lenguaje de marcas";
        int cadena2=5, cadena3=9;
        String b1 = cadena1.substring(cadena2,cadena3);
        String b2 = c.extraerSubstring(cadena1,cadena2,cadena3);
        assertEquals(b1,b2);
    }
    @Test
    public void extraerSubstring2posicionesD() {
        String cadena1="Sistemas informaticos";
        int cadena2=7;
        String b1 = cadena1.substring(cadena2);
        String b2 = c.extraerSubstring(cadena1,cadena2);
        assertEquals(b1,b2);
    }
    @Test
    public void extraerSubstring3posicionesD() {
        String cadena1="Sistemas informaticos";
        int cadena2=8, cadena3=9;
        String b1 = cadena1.substring(cadena2,cadena3);
        String b2 = c.extraerSubstring(cadena1,cadena2,cadena3);
        assertEquals(b1,b2);
    }
    
    
    
}
