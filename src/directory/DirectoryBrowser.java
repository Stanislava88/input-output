package directory;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DirectoryBrowser {
  public List<String> listContent(String path) throws IOException, FileException {
    Path dirs = Paths.get(path);
    dirs.toRealPath();
    List<String> listOfDir = new ArrayList<>();
    if (Files.isRegularFile(dirs)) {
      throw new FileException("The path shows file.");
    } else {
      try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirs)) {
        for (Path paths : stream) {
          if (Files.isDirectory(paths)) {
            listOfDir.add("Dir:" + paths.getFileName());
          }
          if (Files.isRegularFile(paths)) {
            listOfDir.add("File:" + paths.getFileName());
          }
        }
      } catch (NoSuchFileException ex) {
        ex.printStackTrace();
      }
    }
    return listOfDir;
  }
}


