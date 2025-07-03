package August.ex_17082024.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab192 {
    public static void main(String[] args) {
        // Exception - 2 types - Checked and Unchecked
        // Checked means - JVM knows
//        try {
//            FileInputStream file = new FileInputStream("C://log.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        // UnChecked
        try {
            int a = 10;
            int c = a/0; // java.lang.ArithmeticException
            // In this case, this exception came at runtime and JVM doesn't know about this exception
            System.out.println("c");
        } catch (Exception e) {
            System.out.println("Error -  divided by zero");
        }
        System.out.println("End of the program");

    }
}