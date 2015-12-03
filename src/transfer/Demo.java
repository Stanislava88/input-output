package transfer;

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
    try {
      TransferObject obj = new TransferObject();
      Path source = Paths.get("source.txt");
      Path destination = Paths.get("destination.txt");
      FileInputStream input = new FileInputStream(String.valueOf(source));
      FileOutputStream output = new FileOutputStream(String.valueOf(destination));
      int startByte = 1;
      int limit=10;
      obj.transferLimit(input, output, startByte,limit);
    } catch (FileNotFoundException ex) {
      System.out.println(("The file doesn't found. Please check the file name!"));
    }
  }
}
