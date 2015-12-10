package directory;


import java.io.IOException;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) throws IOException, DirectoryNotFound {
    DirectoryBrowser browser = new DirectoryBrowser();
    String path = "/home/clouway/workspace/idea/input-output";
    for (String dirs : browser.listContent(path)) {
      System.out.println(dirs);
    }
  }
}
