package reverse;

import com.sun.net.httpserver.Authenticator.Success;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class File {
  private Reader reader = null;
  private Writer writer = null;

  public String reverse(Reader in, Writer out) throws IOException {
    String end = "Success";
    try {
      BufferedReader reader1 = new BufferedReader(in);
      writer = new BufferedWriter(out);
      String line;
      StringBuilder buffer = new StringBuilder();
      while ((line = reader1.readLine()) != null) {
        buffer.append(line);
        buffer.reverse();
        writer.write(buffer.toString());
      }
    } finally {
      if (reader != null) {
        reader.close();
      }
      if (writer != null) {
        writer.close();
      }
    }
    return end;
  }
}
