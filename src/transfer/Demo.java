package transfer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    Path source = Paths.get("source.txt");
    Path destination = Paths.get("destination.txt");
    BufferedInputStream input = new BufferedInputStream(new FileInputStream(String.valueOf(source)));
    BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(String.valueOf(destination)));
    try {
      int startByte = 0;
      TransferObject obj = new TransferObject();
      obj.transfer(input, output);
      obj.transfer(input, output, startByte, 10);
    } finally {
      if (input != null) {
        input.close();
      }
      if (output != null) {
        output.close();
      }
    }
  }
}
