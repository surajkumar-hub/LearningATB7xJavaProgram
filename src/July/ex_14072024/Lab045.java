package July.ex_14072024;

public class Lab045 {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) Operators
        // Pre and Post

        // pre - increment ++operand
        // value is incremented first and then stored in the result.
//        int a = 10;
//        int b = ++a; // a = a+1;
//        // Exp = 11 , a = 11
//        System.out.println(a); O/P: 11
//        System.out.println(b); O/P: 11


//
//        int a = 10;
//        System.out.println(++a);
//        // Exp = 11 , a = 11


        // POST
        //  value is stored in the result and incremented later
        int a_post = 10;
        System.out.println(a_post++); // O/P: 10
        System.out.println(a_post); // O/P: 11
        // Exp = 10 , a = 11

    }
}
