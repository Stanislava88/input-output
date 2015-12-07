package transfer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class TransferObject {
  public void transfer(InputStream in, OutputStream out, int startByte) throws IOException {
    byte[] data = new byte[1024];
    in.skip(startByte);
    int c = in.read(data);
    if (c != -1) {
      out.write(data, 0, c);
    }
  }

  public void transfer(InputStream in, OutputStream out, int startByte, int limit) throws IOException {
    byte[] data = new byte[1024];
    int c = in.read(data);
    if (c != -1) {
      out.write(data, startByte, limit);
    }
  }
}

