package directory;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DirectoryBrowser {
  public List<String> listContent(String path) throws IOException {
    List<String> listOfDir = new ArrayList<String>();
    File dir = new File(path);
    if (dir.isFile()) {
      listOfDir.add("This is file");
    } else {
      File[] dirs = dir.listFiles();
      for (int i = 0; i < dirs.length; i++) {
        if (dirs[i].isDirectory()) {
          listOfDir.add("Dir:" + dirs[i].getName());
        }
        if (dirs[i].isFile()) {
          listOfDir.add("File:" + dirs[i].getName());
        }
      }
    }
    return listOfDir;
  }
}

