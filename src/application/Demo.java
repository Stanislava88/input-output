package application;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    File file = new File();
    System.out.println("Enter text! Enter a special symbol for end.");
    file.readConsoleWriteFile(new BufferedReader(new InputStreamReader(System.in)), "@");
  }
}
