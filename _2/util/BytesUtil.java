package util;

public class BytesUtil {
    public static String convertBytesToHex(byte[] byteArr) {
        StringBuilder builder = new StringBuilder();
        for (byte aByteArr : byteArr) {
            if ( Integer.toHexString(0xFF & aByteArr).length() == 1 ) {
                builder.append("0").append(
                        Integer.toHexString(0xFF & aByteArr));
            } else {
                builder.append(Integer.toHexString(0xFF & aByteArr));
            }
        }
        return builder.toString();
    }

    public static char[] convertStrToBin(String str){
        char[] strChar = str.toCharArray();
        String result = "";
        for (char aStrChar : strChar) {
            result += Integer.toBinaryString(aStrChar) + " ";
        }
        System.out.println(result);
        return strChar;
    }
}
