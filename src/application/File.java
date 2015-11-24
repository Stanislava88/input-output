package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class File {
  public void readConsoleWriteFile(Reader in, String separator) throws IOException {
    BufferedWriter out = null;
    try {
      in = new BufferedReader(new InputStreamReader(System.in));
      out = new BufferedWriter(new FileWriter("test.txt"));
      String text;
      do {
        text = String.valueOf(in.read());
        out.write(text);
      } while (!text.equals(separator));
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
