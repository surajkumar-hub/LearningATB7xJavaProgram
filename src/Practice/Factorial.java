package Practice;

public class Factorial {
    public static void main(String[] args) {
        int num = 10;
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result = result * i;
        }

        System.out.println("Factorial of " + num + " is " + result);
    }
}


