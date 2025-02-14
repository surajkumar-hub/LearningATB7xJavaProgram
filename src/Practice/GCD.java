package Practice;

public class GCD {
    public static void main(String[] args)
    {
        int a = 62;
        int b = 56;
        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD is: " + a);
    }
}
