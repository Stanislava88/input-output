package directory;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DirectoryBrowser {
  public List<String> listContent(String path) throws DirectoryNotFound {
    File dir = new File(path);
    List<String> listOfDir = new ArrayList<String>();
    if (!dir.exists()) {
      throw new DirectoryNotFound("This directory or file name is not found");
    } else if (dir.isDirectory()) {
      File[] dirs = dir.listFiles();
      for (int i = 0; i < dirs.length; i++) {
        if (dirs[i].isDirectory()) {
          listOfDir.add("Dir:" + dirs[i].getName());
        }
        if (dirs[i].isFile()) {
          listOfDir.add("File:" + dirs[i].getName());
        }
      }
    } else listOfDir.add("This is file");
    return listOfDir;
  }
}
