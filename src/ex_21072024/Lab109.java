package ex_21072024;

public class Lab109 {
    public static void main(String[] args) {
        // Find out even and odd number
        for (int i = 0; i <= 50; i++) // i = 0 to 50, times  = 51
        {
            if (i % 2 == 0)
            {
                System.out.println("Even -> " + i);
                continue;
            }
            System.out.println("Odd -> "+ i);
        }
    }
}
