package application;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File();
        System.out.println("Enter text:");
        file.readConsoleWriteFile();
    }
}
