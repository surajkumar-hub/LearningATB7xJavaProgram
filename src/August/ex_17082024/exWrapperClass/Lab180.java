package August.ex_17082024.exWrapperClass;

public class Lab180 {
    public static void main(String[] args) {
        String num = "10";
        //int a = (int)num; // Like this we can't get the value 10. Not possible in-case of primitive
        Integer a = Integer.valueOf(num); // Like this we can convert the string to object
        System.out.println(a);

        // Convert String to Primitive
        int a2 = Integer.parseInt(num); // here first we converted string value to Integer, then we are
        // converting Integer to primitive data type
        System.out.println(a2);

        // We"ll use this concept whenever we are converting String ->  int, Integer
        // When will we use this concept - Primitive to Wrapper or reverse then we"ll use the concept.

    }
}
