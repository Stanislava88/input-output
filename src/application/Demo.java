package application;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File();
        System.out.println("Enter text!");
        Path path = Paths.get("file.txt");
        Charset charset = Charset.forName("UTF-8");
        BufferedWriter writer = Files.newBufferedWriter(path, charset);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        file.readConsolewriteFile(reader, "@", writer);
    }
}
