package reverse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class File {
  private String fileName;
  private StringBuffer buffer;

  public File(String fileName) {
    this.fileName = fileName;
  }

  public StringBuffer read() throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(fileName));
    try {
      String text;
      buffer = new StringBuffer();
      while ((text = reader.readLine()) != null) {
        buffer.append("\n");
        buffer.append(text);

      }
    } finally {
      if (reader != null) {
        reader.close();
      }
    }
    return buffer;
  }

  public void reverse() throws IOException {
    buffer = read();
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    buffer.reverse();
    writer.write(buffer.toString());
    writer.close();
  }
}
