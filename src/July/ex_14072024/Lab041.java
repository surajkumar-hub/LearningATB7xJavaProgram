package July.ex_14072024;

public class Lab041 {
    public static void main(String[] args) {
        /** Type Casting - when source type is not same as destination type then
         source type must be converted to destination type */
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type) - loss


        // Widening
        byte z = 10;
        int i = (int)z; // VALID – Implicit Casting -  It's done by JVM automatically

        byte b = 10;
        int a = b; // VALID – Implicit Casting
        int a1 = (int) b; // VALID – Explicit Casting
        System.out.println(a1); // O/P: 10
        // When there is a safe convertion no need to type (int) explicitly

        // Narrowing
        int val = 300;
        //byte b1 = val; // Invalid - Here JVM will tell I can't do Implicit Casting
        byte b1 = (byte) val; // InVALID – Explicit Casting - // Loss of data
        System.out.println(b1); // O/P: 44
    }
}

// Note: Whenever a bigger basket value is converting to lower basket, we have to use
// explicit casting
