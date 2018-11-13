package util;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class TripleDesUtil {
    public static byte[] generateKey() {
        try {
            KeyGenerator generator = KeyGenerator.getInstance("DESede");
            generator.init(168);
            SecretKey secretKey = generator.generateKey();
            return secretKey.getEncoded();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static byte[] encrypt(byte[] data, byte[] key) {
        try {
            SecretKey secretKey = new SecretKeySpec(key, "DESede");
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] cipherRes = cipher.doFinal(data);
            return cipherRes;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] decrypt(byte[] data, byte[] key) {
        try {
            SecretKey secretKey = new SecretKeySpec(key, "DESede");
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] plainRes = cipher.doFinal(data);
            return plainRes;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
