package directory;


import java.io.IOException;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    DirectoryBrowser browser = new DirectoryBrowser();
    String path = "./source.txt";
    try {
      for (String dirs : browser.listContent(path)) {
        System.out.println(dirs);
      }
    } catch (NullPointerException ex) {
      System.out.println("This is not file or directory");
    }
  }
}

