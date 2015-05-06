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
public class test11 {
    private CadenasAlumno c = new CadenasAlumno();
    public test11() {
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
    public void empiezaCona() {
        String cadena1="EnTornOS",cadena2="En";
        boolean b1 = cadena1.startsWith(cadena2);
        boolean b2 = c.empiezaCon(cadena1,cadena2);
        assertEquals(b1,b2);
    }
    @Test
    public void empiezaConb() {
        String cadena1="EnTornOS",cadena2="de";
        boolean b1 = cadena1.startsWith(cadena2);
        boolean b2 = c.empiezaCon(cadena1,cadena2);
        assertEquals(b1,b2);
    }
    @Test
    public void empiezaConc() {
        String cadena1="EnTornOS",cadena2="cd";
        boolean b1 = cadena1.startsWith(cadena2);
        boolean b2 = c.empiezaCon(cadena1,cadena2);
        assertEquals(b1,b2);
    }
    @Test
    public void empiezaCond() {
        String cadena1="EnTornOS",cadena2="";
        boolean b1 = cadena1.startsWith(cadena2);
        boolean b2 = c.empiezaCon(cadena1,cadena2);
        assertEquals(b1,b2);
    }
    
    
}
