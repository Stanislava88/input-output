package serialization;


import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.Object;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DataClass {
  public void saveObject(OutputStream out, Object o) throws IOException {
    try {
      ObjectOutputStream output = new ObjectOutputStream(out);
      output.writeObject(o);
      output.flush();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

public Object getObject(InputStream in) throws IOException, ClassNotFoundException {
    Flower flower = null;
    try {
      ObjectInputStream input = new ObjectInputStream(in);
      flower = (Flower) input.readObject();
      input.close();

    } catch (IOException ex) {
      ex.printStackTrace();
    }
    return flower;
  }
}
