package application;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class File {
    public void readConsolewriteFile(Reader reader, String separator, Path path) throws IOException {
        BufferedWriter out = null;
        BufferedReader in = null;
        Charset charset = Charset.forName("UTF-8");
        try {
            in = new BufferedReader(reader);
            out = Files.newBufferedWriter(path, charset);
            String line;
            do {
                line = in.readLine();
                out.write(line);
                out.write("\n");
            } while (!line.equals(separator));
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
