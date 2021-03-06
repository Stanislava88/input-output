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

  public File(String fileName) {

    this.fileName = fileName;
  }

  public void reverse() throws IOException {
    File buf = new File(fileName);
    StringBuffer buffer = buf.read();
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    try {
      writer.write(buffer.toString());
    } finally {
      if (writer != null) {
        writer.close();
      }
    }
  }

  private StringBuffer read() throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(fileName));
    StringBuffer buffer = new StringBuffer();
    String text;
    while ((text = reader.readLine()) != null) {
      buffer.append("\n");
      buffer.append(text);
    }
    reader.close();
    buffer.reverse();

    return buffer;
  }
}
