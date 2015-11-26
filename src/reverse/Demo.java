package reverse;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    File file=new File();
    Charset charset=Charset.forName("UTF-8");
    Path path= Paths.get("./src/reverse/test.txt");
    BufferedReader reader= Files.newBufferedReader(path,charset);
    BufferedWriter writer=Files.newBufferedWriter(path,charset);
    file.reverse(reader,writer);
  }
}
