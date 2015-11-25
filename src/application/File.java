package application;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class File {
  private BufferedReader in;
  private Writer out;

  public void readConsolewriteFile(Reader reader, String separator, Writer writer) throws IOException {
    try {
      in = new BufferedReader(reader);
      out = new BufferedWriter(writer);
      String line;
      while(!(line=in.readLine()).matches(separator)) {
        out.write(line);
        out.write("\n");
      }
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
