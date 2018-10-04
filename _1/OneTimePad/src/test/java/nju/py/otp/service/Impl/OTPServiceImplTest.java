package nju.py.otp.service.Impl;

import nju.py.otp.domain.OTPCipher;
import nju.py.otp.service.OTPService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class OTPServiceImplTest {
    private static final String msg = "hello world";
    @Autowired
    private OTPService otpService;

    @Test
    public void test() {
        OTPCipher otpCipher = new OTPCipher(msg);
        String randomUnicode = otpCipher.getRandomUnicode().toString();
        System.out.println("Random: " + randomUnicode);
        String cipher = otpService.encode(msg, randomUnicode).getData();
        System.out.println("Cipher: " + cipher);
        System.out.println("PlainText:" + otpService.decode(cipher, randomUnicode).getData());
    }

}