import java.security.MessageDigest;

public class SHA1 {
    /**
     * 消息1，2
     */
    private String msg0;

    private String msg1;

    public SHA1(String msg0, String msg1) {
        this.msg0 = msg0;
        this.msg1 = msg1;
    }

    public byte[] encode(byte[] msg, int offset, int len) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-1");
            md.update(msg, offset, len);


        } catch (Exception ex) {
            ex.printStackTrace();
        }

        assert md != null;
        return md.digest();
    }

    public String[] encode() {
        String msgCode0 = HexUtil.convertToHex(msg0.getBytes());
        String msgCode1 = HexUtil.convertToHex(msg1.getBytes());
        return new String[] {msgCode0, msgCode1};
    }

    public int getCollisions() {
        String msg0 = encode()[0];
        String msg1 = encode()[1];
        int count = 0;
        for (int i = 0; i < Math.min(msg0.length(), msg1.length()); i++) {
            if (msg0.charAt(i) == msg1.charAt(i) ) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        SHA1 sha1 = new SHA1("dsah2sdk", "fjeqg3dk");
        for(String s: sha1.encode()) {
            System.out.println(s);
        }
        System.out.println("The same total: " + sha1.getCollisions());
    }


}