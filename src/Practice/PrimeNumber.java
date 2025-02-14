package Practice;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 4;
        boolean isPrime = true;  // Assume the number is prime initially
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
        {
            System.out.println(num + " is a prime number.");
        } else
        {
            System.out.println(num + " is not a prime number.");
        }
    }
}
