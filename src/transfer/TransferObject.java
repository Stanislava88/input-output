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
    int data;
    in.skip(startByte);
    while ((data = in.read()) != -1 && count < limit) {
      out.write(data);
      count++;
    }
    return count;
  }
}

