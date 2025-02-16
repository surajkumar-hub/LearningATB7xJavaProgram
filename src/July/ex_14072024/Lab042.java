package July.ex_14072024;

public class Lab042 {
    public static void main(String[] args) {
        long phone_no = 9876543210L;
        // short s = phone_no; // Implicit Narrowing - JVM?
        short s = (short) phone_no;
        System.out.println(s);
        // In the JVM there is something called Garbage Collector
        // Overflows data or waste data will go to the GC

    }
}

