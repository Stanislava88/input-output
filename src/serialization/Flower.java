package serialization;

import java.io.Serializable;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Flower implements Serializable {
  private String type;
  public String color;
  private int number;

  public Flower(String type, String color, int number) {
    this.type = type;
    this.color = color;
    this.number = number;
  }

  public String toString() {
    return "Type:" + type + " " + "Color:" + color + " " + "Number:" + number;
  }

}
