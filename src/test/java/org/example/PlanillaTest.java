package org.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael
 */
public class PlanillaTest {

    public PlanillaTest() {
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

    /**
     * Test of calculaSalarioBruto method, of class Planilla.
     */

    @Test
    public void testCalculaSalarioNeto1() throws Exception {
        System.out.println("calculaSalarioNeto1");
        float salarioBruto = 2000.0F;
        Planilla instance = new Planilla();
        float expResult = 1640.0F;
        float result = instance.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testCalculaSalarioNeto2() throws Exception {
        System.out.println("calculaSalarioNeto2");
        float salarioBruto = 1500.0F;
        Planilla instance = new Planilla();
        float expResult = 1230.0F;
        float result = instance.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testCalculaSalarioNeto3() throws Exception {
        System.out.println("calculaSalarioNeto3");
        float salarioBruto = 1499.99F;
        Planilla instance = new Planilla();
        float expResult = 1259.9916F;
        float result = instance.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
    }


    @Test
    public void testCalculaSalarioNeto4() throws Exception {
        System.out.println("calculaSalarioNeto4");
        float salarioBruto = 1250.00F;
        Planilla instance = new Planilla();
        float expResult = 1050.00F;
        float result = instance.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
    }


    @Test
    public void testCalculaSalarioNeto5() throws Exception {
        System.out.println("calculaSalarioNeto5");
        float salarioBruto = 1000.00F;
        Planilla instance = new Planilla();
        float expResult = 840.00F;
        float result = instance.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
    }


    @Test
    public void testCalculaSalarioNeto6() throws Exception {
        System.out.println("calculaSalarioNeto6");
        float salarioBruto = 999.99F;
        Planilla instance = new Planilla();
        float expResult = 999.99F;
        float result = instance.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCalculaSalarioNeto7() throws Exception {
        System.out.println("calculaSalarioNeto7");
        float salarioBruto = 500.00F;
        Planilla instance = new Planilla();
        float expResult = 500.00F;
        float result = instance.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCalculaSalarioNeto8() throws Exception {
        System.out.println("calculaSalarioNeto8");
        float salarioBruto = 0.00F;
        Planilla instance = new Planilla();
        float expResult = 0.00F;
        float result = instance.calculaSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
    }


    @Test
    public void testCalculaSalarioNeto9() throws Exception {

        System.out.println("calculaSalarioNeto9");

        float salarioBruto = -1.00F;

        try{

            Planilla instance = new Planilla();
            float result = instance.calculaSalarioNeto(salarioBruto);
            fail("No se lanzo una excepcion");
            // TODO review the generated test code and remove the default call to fail.
            // fail("The test case is a prototype.");
        }catch(Exception e){
            // e.printStackTrace();
            assertTrue(true);
        }
    }


    @Test
    public void testCalculaSalarioBruto1() throws Exception {

        System.out.println("calculaSalarioBruto1");

        int tipoempleado = 1;
        float montoVentas = 2000.0F;
        int horasExtra = 8;
        Planilla instance = new Planilla();
        float expResult = 1360.0F;

        float result = instance.calculaSalarioBruto(tipoempleado, montoVentas, horasExtra);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");

    }

    @Test
    public void testCalculaSalarioBruto2() throws Exception {

        System.out.println("calculaSalarioBruto2");

        int tipoempleado = 1;
        float montoVentas = 1500.0F;
        int horasExtra = 3;
        Planilla instance = new Planilla();
        float expResult = 1260.0F;

        float result = instance.calculaSalarioBruto(tipoempleado, montoVentas, horasExtra);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");

    }

    @Test
    public void testCalculaSalarioBruto3() throws Exception {

        System.out.println("calculaSalarioBruto3");

        int tipoempleado = 1;
        float montoVentas = 1499.99F;
        int horasExtra = 0;
        Planilla instance = new Planilla();
        float expResult = 1100.0F;

        float result = instance.calculaSalarioBruto(tipoempleado, montoVentas, horasExtra);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");

    }

    @Test
    public void testCalculaSalarioBruto4() throws Exception {

        System.out.println("calculaSalarioBruto4");

        int tipoempleado = 2;
        float montoVentas = 1250.00F;
        int horasExtra = 8;
        Planilla instance = new Planilla();
        float expResult = 1760.0F;

        float result = instance.calculaSalarioBruto(tipoempleado, montoVentas, horasExtra);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");

    }
    @Test
    public void testCalculaSalarioBruto5() throws Exception {

        System.out.println("calculaSalarioBruto5");

        int tipoempleado = 2;
        float montoVentas = 1000.00F;
        int horasExtra = 0;
        Planilla instance = new Planilla();
        float expResult = 1600.0F;

        float result = instance.calculaSalarioBruto(tipoempleado, montoVentas, horasExtra);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");

    }

    @Test
    public void testCalculaSalarioBruto6() throws Exception {

        System.out.println("calculaSalarioBruto6");
        int tipoempleado = 2;
        float montoVentas = 999.99F;
        int horasExtra = 3;
        Planilla instance = new Planilla();
        float expResult = 1560.0F;

        float result = instance.calculaSalarioBruto(tipoempleado, montoVentas, horasExtra);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");

    }

    @Test
    public void testCalculaSalarioBruto7() throws Exception {

        System.out.println("calculaSalarioBruto7");
        int tipoempleado = 2;
        float montoVentas = 500.00F;
        int horasExtra = 0;
        Planilla instance = new Planilla();
        float expResult = 1500.0F;

        float result = instance.calculaSalarioBruto(tipoempleado, montoVentas, horasExtra);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");

    }

    @Test
    public void testCalculaSalarioBruto8() throws Exception {

        System.out.println("calculaSalarioBruto8");
        int tipoempleado = 2;
        float montoVentas = 0.00F;
        int horasExtra = 8;
        Planilla instance = new Planilla();
        float expResult = 1660.0F;

        float result = instance.calculaSalarioBruto(tipoempleado, montoVentas, horasExtra);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");

    }

    @Test
    public void testCalculaSalarioBruto9() throws Exception {

        System.out.println("calculaSalarioBruto9");

        int tipoempleado = 1;
        float montoVentas = -1.00F;
        int horasExtra = 8;

        try{

            Planilla instance = new Planilla();
            float result = instance.calculaSalarioBruto(tipoempleado, montoVentas, horasExtra);
            fail("No se lanzo una excepcion");
            // TODO review the generated test code and remove the default call to fail.
            // fail("The test case is a prototype.");
        }catch(Exception e){
            //  e.printStackTrace();
            assertTrue(true);
        }
    }

    @Test
    public void testCalculaSalarioBruto10() throws Exception {

        System.out.println("calculaSalarioBruto10");

        int tipoempleado = 1;
        float montoVentas = 1500.00F;
        int horasExtra = -1;

        try{

            Planilla instance = new Planilla();
            float result = instance.calculaSalarioBruto(tipoempleado, montoVentas, horasExtra);
            fail("No se lanzo una excepcion");
            // TODO review the generated test code and remove the default call to fail.
            // fail("The test case is a prototype.");
        }catch(Exception e){
            // e.printStackTrace();
            assertTrue(true);
        }
    }

    @Test
    public void testCalculaSalarioBruto11() throws Exception {

        System.out.println("calculaSalarioBruto11");

        int tipoempleado = 3;
        float montoVentas = 1500.00F;
        int horasExtra = 8;

        try{

            Planilla instance = new Planilla();
            float result = instance.calculaSalarioBruto(tipoempleado, montoVentas, horasExtra);
            fail("No se lanzo una excepcion");
            // TODO review the generated test code and remove the default call to fail.
            // fail("The test case is a prototype.");
        }catch(Exception e){
            // e.printStackTrace();
            assertTrue(true);
        }
    }

}
