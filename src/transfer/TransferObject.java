package transfer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class TransferObject {
  public void transfer(InputStream in, OutputStream out, int startByte, int limit) throws IOException {
    byte[] data = new byte[limit];
    in.skip(startByte);
    int c = in.read(data);
    out.write(data, 0, c);
  }
}

