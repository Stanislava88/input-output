package directory;


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
  public List<Path> listContent(String path) throws IOException, FileException {
    Path dirs = Paths.get(path);
    dirs.toRealPath();
    List<Path> listOfDir = new ArrayList<>();
    if (Files.isRegularFile(dirs)) {
      throw new FileException("The path shows file.");
    } else {
      try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirs)) {
        for (Path paths : stream) {
          if (Files.isDirectory(paths)) {
            listOfDir.add(paths.getFileName());
          }
        }
      } catch (NoSuchFileException ex) {
        ex.printStackTrace();
      }
    }
    return listOfDir;
  }

  public List<Path> listOfFile(String path) throws IOException {
    Path paths = Paths.get(path);
    List<Path> listOfFile = new ArrayList<>();
    try (DirectoryStream<Path> stream = Files.newDirectoryStream(paths)) {
      for (Path file : stream) {
        if (Files.isRegularFile(file)) {
          listOfFile.add(file.getFileName());
        }
      }
      stream.close();
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    return listOfFile;
  }
}


