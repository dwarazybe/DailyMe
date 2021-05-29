package client;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BmrCalculatorTest {
    
    public BmrCalculatorTest() {
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
     * Test of calculateKcalAmount method, of class BmrCalculator.
     */
    @Test
    public void testCalculateKcalAmount() {
        System.out.println("calculateKcalAmount");
        double weight = 80.0;
        int height = 180;
        int age = 30;
        double activityLevel = 1.55;
        int gender = 1;
        BmrCalculator instance = new BmrCalculator();
        int expResult = 2761;
        int result = instance.calculateKcalAmount(weight, height, age, activityLevel, gender);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateKcalCutAmount method, of class BmrCalculator.
     */
    @Test
    public void testCalculateKcalCutAmount() {
        System.out.println("calculateKcalCutAmount");
        int kcalAmount = 2761;
        BmrCalculator instance = new BmrCalculator();
        int expResult = 2461;
        int result = instance.calculateKcalCutAmount(kcalAmount);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateKcalOverAmount method, of class BmrCalculator.
     */
    @Test
    public void testCalculateKcalOverAmount() {
        System.out.println("calculateKcalOverAmount");
        int kcalAmount = 2761;
        BmrCalculator instance = new BmrCalculator();
        int expResult = 3061;
        int result = instance.calculateKcalOverAmount(kcalAmount);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateProteinsAmount method, of class BmrCalculator.
     */
    @Test
    public void testCalculateProteinsAmount() {
        System.out.println("calculateProteinsAmount");
        double weight = 80.0;
        BmrCalculator instance = new BmrCalculator();
        int expResult = 172;
        int result = instance.calculateProteinsAmount(weight);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateFatsAmount method, of class BmrCalculator.
     */
    @Test
    public void testCalculateFatsAmount() {
        System.out.println("calculateFatsAmount");
        int kcalAmount = 2761;
        BmrCalculator instance = new BmrCalculator();
        int expResult = 77;
        int result = instance.calculateFatsAmount(kcalAmount);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateFatsCutAmount method, of class BmrCalculator.
     */
    @Test
    public void testCalculateFatsCutAmount() {
        System.out.println("calculateFatsCutAmount");
        int kcalCutAmount = 2461;
        BmrCalculator instance = new BmrCalculator();
        int expResult = 68;
        int result = instance.calculateFatsCutAmount(kcalCutAmount);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateFatsOverAmount method, of class BmrCalculator.
     */
    @Test
    public void testCalculateFatsOverAmount() {
        System.out.println("calculateFatsOverAmount");
        int kcalOverAmount = 3061;
        BmrCalculator instance = new BmrCalculator();
        int expResult = 85;
        int result = instance.calculateFatsOverAmount(kcalOverAmount);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateCarbsAmount method, of class BmrCalculator.
     */
    @Test
    public void testCalculateCarbsAmount() {
        System.out.println("calculateCarbsAmount");
        int kcalAmount = 2761;
        int proteinsAmount = 172;
        int fatsAmount = 77;
        BmrCalculator instance = new BmrCalculator();
        int expResult = 345;
        int result = instance.calculateCarbsAmount(kcalAmount, proteinsAmount, fatsAmount);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateCarbsCutAmount method, of class BmrCalculator.
     */
    @Test
    public void testCalculateCarbsCutAmount() {
        System.out.println("calculateCarbsCutAmount");
        int kcalCutAmount = 2461;
        int proteinsAmount = 172;
        int fatsCutAmount = 68;
        BmrCalculator instance = new BmrCalculator();
        int expResult = 290;
        int result = instance.calculateCarbsCutAmount(kcalCutAmount, proteinsAmount, fatsCutAmount);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateCarbsOverAmount method, of class BmrCalculator.
     */
    @Test
    public void testCalculateCarbsOverAmount() {
        System.out.println("calculateCarbsOverAmount");
        int kcalOverAmount = 3061;
        int proteinsAmount = 172;
        int fatsOverAmount = 85;
        BmrCalculator instance = new BmrCalculator();
        int expResult = 402;
        int result = instance.calculateCarbsOverAmount(kcalOverAmount, proteinsAmount, fatsOverAmount);
        assertEquals(expResult, result);
    }
    
}
