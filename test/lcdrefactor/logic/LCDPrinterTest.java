package lcdrefactor.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan
 */
public class LCDPrinterTest {

    public LCDPrinterTest() {
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
     * Test of procesar method, of class LCDPrinter.
     */
    @Test
    public void testProcesar() {
        System.out.println("procesar");
        String comando = "2,46";
        int espacioDig = 5;
        LCDPrinter instance = new LCDPrinter();
        instance.procesar(comando, espacioDig);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isNumeric method, of class LCDPrinter.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String cadena = "24";
        boolean expResult = true;
        boolean result = LCDPrinter.isNumeric(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of rangeOk method, of class LCDPrinter.
     */
    @Test
    public void testRangeOk() {
        System.out.println("rangeOk");
        boolean expResult, result;
        String cadena = "10";
        int option = 1;
        switch (option) {
            case 1:
                expResult = false;
                result = LCDPrinter.rangeOk(1, cadena);
                assertEquals(expResult, result);
                break;
            case 2:
                expResult = false;
                result = LCDPrinter.rangeOk(2, cadena);
                assertEquals(expResult, result);
                break;
            default:
                break;
        }
        // TODO review the generated test code and remove the default call to fail.
    }

    public void RangeOk(int option, String cadena) {
        
    }
}
