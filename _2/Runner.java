import util.BytesUtil;
import util.FileUtil;
import util.TripleDesUtil;

public class Runner {


    public static void main(String[] args) {
        String DATA = "";
        for(int i = 0; i < 60; i++) {
            DATA += "a";
        }
        byte[] key = TripleDesUtil.generateKey();
        byte[] tridesResult = TripleDesUtil.encrypt(DATA.getBytes(), key);
        byte[] tridesPlain = TripleDesUtil.decrypt(tridesResult, key);
        FileUtil.writeFile("/Users/py/GitHub/3DES/src/main/resources/plain.txt",
                BytesUtil.convertBytesToHex(tridesPlain));
        FileUtil.writeFile("/Users/py/GitHub/3DES/src/main/resources/encrypted.txt",
                BytesUtil.convertBytesToHex(tridesResult));
        FileUtil.writeFile("/Users/py/GitHub/3DES/src/main/resources/key.txt",
                BytesUtil.convertBytesToHex(key));
        System.out.println(key);
        System.out.println(BytesUtil.convertBytesToHex(tridesResult).length());

        System.out.println(new String(tridesPlain));
    }
}
