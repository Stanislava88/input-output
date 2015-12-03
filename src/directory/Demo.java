package directory;

import java.io.IOException;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    DirectoryBrowser dir = new DirectoryBrowser();
    System.out.println(dir.listContent("."));
  }
}
