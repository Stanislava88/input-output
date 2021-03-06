package directory;

import java.io.IOException;
import java.nio.file.NoSuchFileException;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    try {
      DirectoryBrowser browser = new DirectoryBrowser();
      String path = "source.txt";
      System.out.println("Directory" + " " + path + " " + "contains:");
      for (String dir : browser.listContent(path)) {
        System.out.println(dir);
      }
    } catch (NoSuchFileException ex) {
      System.out.println("Wrong file was selected. Please choose another path:" + " " + ex);
    } catch (FileException ex) {
      System.out.println(ex.getMessage());
    }
  }
}

