package miPrincipal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test public void testingList() {
        ClaseParaDepurar c = new ClaseParaDepurar();
        assertTrue(c.echaCuentas()==4950.0);
    }
}
