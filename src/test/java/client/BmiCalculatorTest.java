/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bukow
 */
public class BmiCalculatorTest {
    
    public BmiCalculatorTest() {
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

    /**
     * Test of calculateBmi method, of class BmiCalculator.
     */
    @Test
    public void testCalculateBmi() {
        System.out.println("calculateBmi");
        double weight = 80.0;
        double height = 180.0;
        BmiCalculator instance = new BmiCalculator();
        double expResult = 24.7;
        double result = instance.calculateBmi(weight, height);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of rateBmi method, of class BmiCalculator.
     */
    @Test
    public void testRateBmi() {
        System.out.println("rateBmi");
        double bmi = 24.7;
        BmiCalculator instance = new BmiCalculator();
        String expResult = "PRAWIDŁOWA";
        String result = instance.rateBmi(bmi);
        assertEquals(expResult, result);
    }
    
}
