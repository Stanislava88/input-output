package transfer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class TransferObject {
  public void transfer(InputStream in, OutputStream out) throws IOException {
    int size = in.available();
    byte[] data = new byte[size];
    int c = in.read(data);
    if (c != -1) {
      out.write(data, 0, c);
    }
  }

  public void transfer(InputStream in, OutputStream out, int startByte, int limit) throws IOException {
    int size = in.available();
    byte[] data = new byte[size];
    int c = in.read(data);
    if (c != -1) {
      if (startByte + limit > size) {
        out.write(data, startByte, size - startByte);
      } else {
        out.write(data, startByte, limit);
      }
    }
  }
}




