package July.ex_21072024;

public class Lab109 {
    public static void main(String[] args) {
        // Find out even and odd number
        // Use of continue keyword
        for (int i = 0; i <= 50; i++) // i = 0 to 50, times  = 51
        {
            if (i % 2 == 0)
            {
                System.out.println("Even -> " + i);
                continue; // Continue command will execute when the if condition will be true
            }
            System.out.println("Odd -> "+ i);
        }
    }
}
