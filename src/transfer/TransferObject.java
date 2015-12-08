package transfer;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class TransferObject {
    public void transfer(InputStream in, OutputStream out) throws IOException {
        byte[] data = new byte[1024];
        int c;
        while ((c = in.read(data)) > 0)
            if (c != -1) {
                out.write(data, 0, c);
            }
    }

    public void transfer(InputStream in, OutputStream out, int startByte, int limit) throws IOException {
        byte[] data = new byte[1024];
        int c;
        while ((c = in.read(data)) > 0) {
            if (c != -1) {
                if (startByte + limit > data.length) {
                    out.write(data, startByte, data.length - startByte);
                } else {
                    out.write(data, startByte, limit);
                }
            }
        }
    }
}




