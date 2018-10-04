package nju.py.otp.service;


import nju.py.otp.util.Response;

public interface OTPService {

    Response<String> encode(String plainText, String randomUnicodencode);


    Response<String> decode(String cipher, String randomUnicode);
}
