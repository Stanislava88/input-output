package directory;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    try {
      DirectoryBrowser browser = new DirectoryBrowser();
      String path = ".";
      System.out.println("List of directories in directory:" + path);
      for (Path dirs : browser.listContent(path)) {
        System.out.println(dirs);
      }
      System.out.println("List of files in directory:" + path);
      for (Path file : browser.listOfFile(path)) {
        System.out.println(file);
      }
    } catch (NoSuchFileException ex) {
      System.out.println("Wrong file was selected. Please choose another path:" + " " + ex);
    } catch (FileException ex) {
      System.out.println(ex.getMessage());
    }
  }
}

