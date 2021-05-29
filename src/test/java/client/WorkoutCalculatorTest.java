package client;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkoutCalculatorTest {
    
    public WorkoutCalculatorTest() {
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
     * Test of running method, of class WorkoutCalculator.
     */
    @Test
    public void testRunning() {
        System.out.println("running");
        double weight = 80.0;
        int time = 30;
        int intensityLevel = 2;
        WorkoutCalculator instance = new WorkoutCalculator();
        double expResult = 504.0;
        double result = instance.running(weight, time, intensityLevel);
        assertEquals(expResult, result);
    }

    /**
     * Test of lifting method, of class WorkoutCalculator.
     */
    @Test
    public void testLifting() {
        System.out.println("lifting");
        int time = 30;
        int intensityLevel = 2;
        WorkoutCalculator instance = new WorkoutCalculator();
        double expResult = 240.0;
        double result = instance.lifting(time, intensityLevel);
        assertEquals(expResult, result);
    }

    /**
     * Test of bikeRiding method, of class WorkoutCalculator.
     */
    @Test
    public void testBikeRiding() {
        System.out.println("bikeRiding");
        double weight = 80.0;
        int time = 30;
        int intensityLevel = 2;
        WorkoutCalculator instance = new WorkoutCalculator();
        double expResult = 357.0;
        double result = instance.bikeRiding(weight, time, intensityLevel);
        assertEquals(expResult, result);
    }

    /**
     * Test of football method, of class WorkoutCalculator.
     */
    @Test
    public void testFootball() {
        System.out.println("football");
        double weight = 80.0;
        int time = 30;
        int intensityLevel = 2;
        WorkoutCalculator instance = new WorkoutCalculator();
        double expResult = 168.0;
        double result = instance.football(weight, time, intensityLevel);
        assertEquals(expResult, result);
    }

    /**
     * Test of swimming method, of class WorkoutCalculator.
     */
    @Test
    public void testSwimming() {
        System.out.println("swimming");
        double weight = 80.0;
        int time = 30;
        int intensityLevel = 2;
        WorkoutCalculator instance = new WorkoutCalculator();
        double expResult = 378.0;
        double result = instance.swimming(weight, time, intensityLevel);
        assertEquals(expResult, result);
    }

    /**
     * Test of skating method, of class WorkoutCalculator.
     */
    @Test
    public void testSkating() {
        System.out.println("skating");
        double weight = 80.0;
        int time = 30;
        int intensityLevel = 2;
        WorkoutCalculator instance = new WorkoutCalculator();
        double expResult = 378.0;
        double result = instance.skating(weight, time, intensityLevel);
        assertEquals(expResult, result);
    }

    /**
     * Test of yoga method, of class WorkoutCalculator.
     */
    @Test
    public void testYoga() {
        System.out.println("yoga");
        double weight = 80.0;
        int time = 30;
        int intensityLevel = 2;
        WorkoutCalculator instance = new WorkoutCalculator();
        double expResult = 126.0;
        double result = instance.yoga(weight, time, intensityLevel);
        assertEquals(expResult, result);
    }

    /**
     * Test of jumpingRope method, of class WorkoutCalculator.
     */
    @Test
    public void testJumpingRope() {
        System.out.println("jumpingRope");
        double weight = 80.0;
        int time = 30;
        int intensityLevel = 2;
        WorkoutCalculator instance = new WorkoutCalculator();
        double expResult = 495.6;
        double result = instance.jumpingRope(weight, time, intensityLevel);
        assertEquals(expResult, result);
    }
}
