package marker;

import java.io.*;

public class IO {
    static byte[] read(String filename) {
        byte[] res = new byte[0];
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(filename));
            res = new byte[in.available()];
            in.read(res);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static void write(String filename, byte[] buf) {
        try {
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filename));
            out.write(buf);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
