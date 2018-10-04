package nju.py.otp.controller;

import nju.py.otp.domain.OTPCipher;
import nju.py.otp.service.OTPService;
import nju.py.otp.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class OTPController {
    @Autowired
    private OTPService otpService;

    private String randomUnicode;

    @RequestMapping(value = "/encode", method = RequestMethod.POST)
    @ResponseBody
    public Response<String> encode(String msg) {
        OTPCipher otpCipher = new OTPCipher(msg);
        randomUnicode = otpCipher.getRandomUnicode().toString();
        return otpService.encode(msg, randomUnicode);
    }

    @RequestMapping(value = "/decode", method = RequestMethod.POST)
    @ResponseBody
    public Response<String> decode(String cipher) {
        return otpService.decode(cipher, randomUnicode);
    }

}
