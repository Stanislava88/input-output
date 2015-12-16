package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    DataClass dataClass = new DataClass();
    Flower flowers = new Flower("rose", "red", 3);
    FileOutputStream output = new FileOutputStream("serialization.txt");
    dataClass.saveObject(output, flowers);
    FileInputStream input = new FileInputStream("serialization.txt");
    System.out.println(dataClass.getObject(input));
  }
}
