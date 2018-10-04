package nju.py.otp.domain;

import nju.py.otp.util.RandomUnicodeGenerator;


public class OTPCipher {

    private String plainText;

    private char[] randomUnicode;


    public OTPCipher(String plainText) {
        this.plainText = plainText;
        this.randomUnicode = RandomUnicodeGenerator.generateRandomUnicode(plainText.length());
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public char[] getRandomUnicode() {
        return randomUnicode;
    }


}
