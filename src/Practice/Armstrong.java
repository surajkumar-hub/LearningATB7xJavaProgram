package Practice;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int temp = 0;
        int remainder = 0;
        int digits = 0;
        temp = num;
        while (temp != 0) {
            // temp /= 10;
            temp = temp/10;
            digits++;
        }
        temp = num;
        while (temp != 0) {
            remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
