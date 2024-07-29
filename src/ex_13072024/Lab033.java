package ex_13072024;

public class Lab033 {
    public static void main(String[] args) {
        //  And  && // only true && true returns true
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}

/** O/P:
true
false
false
false **/
