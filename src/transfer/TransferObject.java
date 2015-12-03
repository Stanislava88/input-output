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
    int data;
    for (int i = 0; i < limit; i++) {
      data = in.read();
      out.write(data);
      out.flush();
    }
    in.close();
    out.close();
  }
}

