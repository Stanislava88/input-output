package application;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    try {
      File file = new File();
      System.out.println("Please enter text from console:");
      file.readAndWrite();
    } catch (FileNotFoundException ex) {
      System.out.println("The file is not found!");
    }
  }
}
