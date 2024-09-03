package August.ex_17082024.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab198 {
    public static void main(String[] args) {
        try {
            int a = 10/0; // Uncheck Arithmetic Exception
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader f = new FileReader(new File("c://a.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
