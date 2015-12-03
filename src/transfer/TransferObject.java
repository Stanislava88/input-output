package transfer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class TransferObject {
  public void transferLimit(InputStream in, OutputStream out, long startByte, int limit) throws IOException {
    in.skip(startByte);
    byte[] data = new byte[]{};
    for (int i = 0; i < limit; i++) {
      in.read(data);
      out.write(in.read());
    }
    in.close();
    out.close();
  }
}

