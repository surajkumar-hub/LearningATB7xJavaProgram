package ex_27072024;

public class Lab137 {
    public static void main(String[] args) {
        // String - Bunch of Characters
        // There are two ways to create string - 1. by creating object and 2. by assigning directly
        String s1 = new String("pramod"); // Store in Heap Area
        String s2 = "pramod"; // Stored in String constant pool

        // Strings are Immutable in nature. Means once they are created and if we do any operation,
        // they"ll create a new one. It"ll always create a new one.

        // Below are the functions of String
        System.out.println(s1.length());
        System.out.println(s1.indexOf("p"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
    }
}
