package August.ex_17082024.exWrapperClass;

public class Lab179 {
    public static void main(String[] args) {
        // Converting Primitive to Wrapper class
        int a = 10;
        Integer b = a; // This is primitive to wrapper conversion
        // Integer.MAX_VALUE
        System.out.println(a); // Here a doesn't have any function means by using "a" we can't perform
        // additional actions such as compareTo(), equals(), toString(), intValue() etc.
        System.out.println(b);// extra utilities are added means extra functions we can use


        // Converting Wrapper class to Primitive
        Integer a2 = 42; // Auto Boxing - Means int is always converted to the Integer automatically
        int value = a2; //  UnBoxing - Means converting Integer to int
        System.out.println(a2); // a2 has a lot of functions
        System.out.println(value); // Value doesn't have any functions
        // Disadvantage of converting Wrapper class to Primitive is - we are removing the extra -
        // functionalities. Here we are losing the extra functionalities, losing the objects. When we
        // loose the objects, we"ll loose the attributes and behaviours also.

    }
}
