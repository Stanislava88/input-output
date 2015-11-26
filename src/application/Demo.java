package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    try {
      File app = new File("test.txt");
      System.out.println("Enter text!");
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       app.append(reader, "@");
    } catch (IOException ex) {
      System.out.println("Exception occur");
    }
  }
}
