package client;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SHA256Test {
    
    public SHA256Test() {
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
    public void testEncryptPassword() throws Exception {
        System.out.println("encryptPassword");
        String password = "password";
        byte[] salt = "LTŔ)ÁÁo/łÜµ``ă".getBytes();
        SHA256 instance = new SHA256();
        String expResult = "fbab64829cbe838bc9e7e8cfcc32d980f646201a66a64f43e2a98b407dcdd19a";
        String result = instance.encryptPassword(password, salt);
        assertEquals(expResult, result);
    }
}
