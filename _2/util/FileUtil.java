package util;
import java.io.*;

public class FileUtil {
    public static boolean writeFile(String filename, String content) {
        try {
            File file = new File(filename);
            FileWriter writer = new FileWriter(file, true);
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.write(content);
            printWriter.println();
            writer.close();
            printWriter.close();

            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static byte[] readFile(String fileName) {
        try {

            FileInputStream is = new FileInputStream(fileName);
            int n = 128;
            byte buffer[] = new byte[n];
            while ((is.read(buffer, 0, n) != -1) && (n > 0)) {
                System.out.print(buffer);
            }
            is.close();
            return buffer;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        readFile("/Users/py/GitHub/3DES/src/main/resources/plain.txt");
    }
}
