package August.ex_18082024.ExceptionHandelling;

// Throws Concept

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab201 {
    public static void main(String[] args) throws FileNotFoundException,ArithmeticException
    {
        readFile();
    }

    private static void readFile() throws FileNotFoundException,ArithmeticException
    {
        System.out.println("Hello Pramod");
        String path = "/Users/promode/Downloads/Ad1.mp4";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);

        // Filereader method is used to read the txt file txt.
        System.out.println("End of the program");



    }
}
/** If we don't know what type of exception can come, then we can call the parent

public static void main(String[] args) throws exception
 {
 readFile();
 }

 private static void readFile() throws exception
 {
 System.out.println("Hello Pramod");
 String path = "/Users/promode/Downloads/Ad1.mp4";
 File file = new File(path);
 FileReader fileReader = new FileReader(file); **/

