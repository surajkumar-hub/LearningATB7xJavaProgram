package July.ex_14072024;

public class Lab039 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 23;
        int c = a+b;
        System.out.println(c);

        char a1 = 'A';
        char b1 = 'B';
        int c1 = a1+b1; // When we are adding 2 characters it"ll get combined &
        // the value will come as ASCII value of A & B. That's why datatype is int
        System.out.println(c1); //(65+66)
        System.out.println('A' == 65);
        System.out.println('B' == 69);
    }
}
