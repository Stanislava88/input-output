package application;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class File {
  String fileName;
  public File(String fileName){
    this.fileName=fileName;
  }

  public void append(Reader reader, String separator) throws IOException {
    BufferedReader in = new BufferedReader(reader);
    try {
      String line;
      StringBuffer buf=new StringBuffer();
      while (!(line = in.readLine()).matches(separator)) {
        buf.append(line);
        buf.append("\n");
        Path path = Paths.get(fileName);
        Files.write(path, (buf.toString()).getBytes());
      }
    } finally {
      if (in != null) {
        in.close();
      }
    }
  }
}
