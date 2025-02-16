package July.ex_14072024;

public class Lab047 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a); //O/P: 11
        System.out.println(a++); //O/P: 10
        System.out.println(a++ + a);
        // A = a++ -> 10 , a = 11
        // +
        // B = a = 11 ->  A+B = 10+11
        System.out.println(a++ + ++a); // O/P = 22 Expression value we need to add
        // A = a++ -> Exp = 10 | a = 11
        // +
        // B = ++a -> Exp = 12 | a = 12
        System.out.println(a); //O/P: 12
    }
}
