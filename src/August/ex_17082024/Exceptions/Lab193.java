package August.ex_17082024.Exceptions;

public class Lab193 {
    public static void main(String[] args) {
        int c = 0;
        try {
            c = 10/0;
        } catch (Exception e) {
            // throw new RuntimeException(e); // Instead of this line we can add our own comment
            System.out.println("/ by zero!!, You fool!!");
        }
        System.out.println(c);
        System.out.println("End");
    }
}
