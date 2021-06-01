package client;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BfiCalculatorTest {
    
    public BfiCalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCalculateBfi() {
        System.out.println("calculateBfi");
        double weight = 80.0;
        double waist = 90.0;
        int gender = 1;
        BfiCalculator instance = new BfiCalculator();
        double expResult = 19.4;
        double result = instance.calculateBfi(weight, waist, gender);
        assertEquals(expResult, result);
    }

    @Test
    public void testRateBfi() {
        System.out.println("rateBfi");
        double bfi = 19.4;
        int gender = 1;
        BfiCalculator instance = new BfiCalculator();
        String expResult = "PRZECIĘTNA";
        String result = instance.rateBfi(bfi, gender);
        assertEquals(expResult, result);
    } 
}
