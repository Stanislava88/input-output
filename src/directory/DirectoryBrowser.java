package directory;


import java.io.File;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DirectoryBrowser {
  public StringBuilder listContent(String path) {
    File dir = new File(path);
    StringBuilder buf = new StringBuilder();
    if (dir.isDirectory()) {
      File[] files = dir.listFiles();
      for (int i = 0; i < files.length; i++) {
        if (files[i].isFile()) {
          buf.append("\n");
          buf.append(files[i]);
          buf.append(" " + "is file");
        }
        if (files[i].isDirectory()) {
          buf.append("\n");
          buf.append(files[i]);
          buf.append(" " + "is directory");
        }
      }
    } else buf.append("This is file");
    return buf;
  }
}
