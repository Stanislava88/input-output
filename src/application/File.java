package application;

import java.io.*;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class File {
  String fileName;
  public File(String fileName){
    this.fileName=fileName;
  }

  public void append(Reader reader, String separator) throws IOException {
    FileWriter out = null;
    try {
      BufferedReader in = new BufferedReader(reader);
      java.io.File file = new java.io.File(fileName);
      out = new FileWriter(file);
      String line;
      while (!(line = in.readLine()).matches(separator)) {
        out.write(line);
        out.write("\n");
      }
    } finally {
      if (out != null) {
        out.close();
      }
    }
  }
}
