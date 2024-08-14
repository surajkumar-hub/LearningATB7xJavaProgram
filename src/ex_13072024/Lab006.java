package ex_13072024;

public class Lab006 {
    public static void main(String[] args) {

        // What is the structure to create a variable
        // data_type variable_name = variable_value(literal)

        // Data Type:
        // 1. Primitive Data Type:
          // 1.1 Boolean
            // True or False
        boolean is_married = true;
        boolean are_you_a_dog = false;
        System.out.println(is_married);
        System.out.println(are_you_a_dog);
          // 1.2 Numerical
            // 1.2.1 Integer -  byte, short, int, long
        byte b = 100;
        short s = 101;
        int age = 130;
        long phone_number = 7894797919L; //7894797919l;

            // 1.3 Char - It can store only characters (a)
        char grade = 'a';

            // 1.4 Floating
               // 1.4.1 Float
        float pi = 3.14F; //3.14f;
               // 1.4.2 Double
        double d = 118.654;

        // 2. Non-Primitive Data Type:
        //Non-primitive means, it's created from a bunch of characters
        // It's created from primitive
        String name = "Suraj"; // In this case collection of primitive is non-primitive
        String name2 = "S";
        //char cc = "c";
    }
}
