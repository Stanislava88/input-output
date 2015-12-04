package transfer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class TransferObject {
  public int transfer(InputStream in, OutputStream out, long startByte, int limit) throws IOException {
    int count = 0;
    byte[] data = new byte[] {};
    in.skip(startByte);
    do {
      in.read(data, 0, data.length);
      out.write(in.read());
      count++;
    } while (data.length != -1 && count < limit);
    return count;
  }
}

