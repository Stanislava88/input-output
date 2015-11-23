package application;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class File {
  public void readAndWrite() throws IOException {
    InputStreamReader in = null;
    FileWriter out = null;
    try {
      in = new InputStreamReader(System.in);
      out = new FileWriter("./src/application/file.txt");
      char text;
      do {
        text = (char) in.read();
        out.write(text);
      } while (text != '.');
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
