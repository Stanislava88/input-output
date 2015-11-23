package application;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class File {
    public void readConsoleWriteFile() throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        Path path = Paths.get(".\\src\\application\\file");
        Charset charset = Charset.forName("US-ASCII");
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            in = new BufferedReader(reader);
            out = Files.newBufferedWriter(path, charset);
            String text;
            do {
                text = in.readLine();
                out.append("\n");
                out.write(text);
            } while (!text.equals("@") && !text.equals("/"));
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
