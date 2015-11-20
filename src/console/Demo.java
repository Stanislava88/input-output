package console;

import java.io.IOException;
import java.util.InputMismatchException;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        try {
            Console value = new Console();
            System.out.println("Enter string:");
            System.out.println(value.readString());
            System.out.println("Enter int:");
            System.out.println(value.readInt());
            System.out.println("Enter char:");
            System.out.println(value.readChar());
            System.out.println("Enter float:");
            System.out.println(value.readFloat());
        } catch (InputMismatchException e) {
            System.out.println("The enetered value is invalid!");
        }catch (StringIndexOutOfBoundsException ex){
            System.out.println("The enetered character is missing!");
        }
    }
}
