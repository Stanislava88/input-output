package console;

import java.util.Scanner;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Console {
  private Scanner value = new Scanner(System.in);

  public String readString() {
    String string = value.next();
    return string;
  }

  public int readInt() {
    int num = value.nextInt();
    return num;
  }

  public char readChar() {
    char character = value.next().charAt(3);
    return character;
  }

  public float readFloat() {
    float number = value.nextFloat();
    return number;
  }
}
