package client;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SHA256 {
    protected String encryptPassword(String password, byte[] salt) throws NoSuchAlgorithmException {
        String encryptedPassword = null;
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(salt);
        byte[] bytes = md.digest(password.getBytes());
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<bytes.length; i++) 
            builder.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        encryptedPassword = builder.toString();
        return encryptedPassword;
    }
    
    protected byte[] getSalt() throws NoSuchAlgorithmException {
        SecureRandom rand = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16];
        rand.nextBytes(salt);
        return salt;
    }
}
