package nju.py.otp.util;

import java.security.SecureRandom;

/*
* Generate the random bit
* */
public class RandomUnicodeGenerator {
    private static SecureRandom secureRandom = new SecureRandom();

    public static char[] generateRandomUnicode(int length) {
        char[] randomBitArray = new char[length];
        for(int i = 0; i < length; i++) {
            randomBitArray[i] = transferIntToChar();
        }

        return randomBitArray;
    }

    // Check whether the unicode is defined
    private static char transferIntToChar(){
        while (true) {
            char uncheckedCharacter = (char) (secureRandom.nextInt() & 0xFFFF);

            if (Character.isDefined(uncheckedCharacter)){
                return uncheckedCharacter;
            }
        }
    }

}
