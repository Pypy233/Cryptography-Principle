package nju.py.otp.service.Impl;

import nju.py.otp.service.OTPService;
import nju.py.otp.util.Response;
import org.springframework.stereotype.Service;

@Service
public class OTPServiceImpl implements OTPService {
    @Override
    public Response<String> encode(String plainText, String randomUnicodencode) {
        try {
            return new Response<>(true, arrayOrArray(plainText, randomUnicodencode), "Succeed to encode...");
        }catch (Exception ex){
            ex.printStackTrace();
            return new Response<>(false, null, "Fail to encode...");
        }
    }

    @Override
    public Response<String> decode(String cipher, String randomUnicode) {
        try {
            return new Response<>(true, arrayOrArray(cipher, randomUnicode), "Succeed to encode...");
        }catch (Exception ex){
            ex.printStackTrace();
            return new Response<>(false, null, "Fail to encode...");
        }
    }

    private String arrayOrArray(String msg1, String msg2) {
        byte[] resArray = new byte[msg1.length()];
        for(int i = 0; i < msg1.length(); i++) {
            resArray[i] = (byte) (msg1.charAt(i) ^ msg2.charAt(i));
        }

        return new String(resArray);
    }
}
