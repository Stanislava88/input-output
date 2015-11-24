package application;


import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File();
        System.out.println("Enter text!");
        Path path= Paths.get("file.txt");
        file.readConsolewriteFile(new InputStreamReader(System.in), "@",path);
    }
}
