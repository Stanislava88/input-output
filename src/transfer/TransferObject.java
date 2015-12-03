package transfer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class TransferObject {
  public void transferLimit(InputStream in, OutputStream out, long startByte, int limit) throws IOException {
    String line = " ";
    try {
      byte[] data = line.getBytes();
      in.skip(startByte);
      for (int i = 0; i < limit + 1; i++) {
        in.read(data);
        out.write(data);
      }
    } finally {
      if (in != null) {
        in.close();
      }
      if (out != null) {
        out.close();
      }
    }
  }
}
