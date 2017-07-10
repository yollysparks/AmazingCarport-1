/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DomainServices;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felesiah
 */
public class CarportCalculatorTest {
    
    public CarportCalculatorTest() {
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
     * Test of calculatePrice method, of class CarportCalculator.
     */
    @Test
    public void testCalculatePrice() {
        System.out.println("calculatePrice");
        int width = 250;
        int length = 450;
        CarportCalculator instance = new CarportCalculator();
        int expResult = 35000;
        int result = instance.calculatePrice(width, length);
        assertEquals(expResult, result);
       
    }

   
}
