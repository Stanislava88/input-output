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
  public List<String> listContent(String path) throws IOException, FileException {
    Path dirs = Paths.get(path);
    dirs.toRealPath();
    List<String> listOfFiles = listOfDirectory(path);
    try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirs)) {
      for (Path file : stream) {
        if (Files.isRegularFile(file)) {
          listOfFiles.add(file.getFileName().toString());
        }
      }
    } catch (NoSuchFileException ex) {
      ex.printStackTrace();
    }
    return listOfFiles;
  }

  private List<String> listOfDirectory(String path) throws IOException, FileException {
    Path paths = Paths.get(path);
    List<String> listOfDir = new ArrayList<>();
    if (Files.isRegularFile(paths)) {
      throw new FileException("The path shows file.");
    } else {
      try (DirectoryStream<Path> stream = Files.newDirectoryStream(paths)) {
        for (Path dir : stream) {
          if (Files.isDirectory(dir)) {
            listOfDir.add(dir.getFileName().toString());
          }
        }
        stream.close();
      } catch (FileNotFoundException ex) {
        ex.printStackTrace();
      }
      return listOfDir;
    }
  }
}


