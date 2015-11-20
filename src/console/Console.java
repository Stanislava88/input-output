package console;

import java.util.Scanner;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Console {
    private Scanner scanner = new Scanner(System.in);

    public String readString() {
        String string = scanner.next();
        return string;
    }

    public int readInt() {
        int num = scanner.nextInt();
        return num;
    }

    public char readChar() {
        char character = scanner.next().charAt(0);
        return character;
    }

    public float readFloat() {
        float number = scanner.nextFloat();
        return number;
    }
}
