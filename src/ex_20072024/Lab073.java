package ex_20072024;

import java.util.Scanner;

public class Lab073 {
    public static void main(String[] args) {
        // Max number in two inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter the num 2");
        int num2 = sc.nextInt();

//        System.out.println(Math.max(num1,num2)); We can use this logic also

        if (num1 > num2) {
            System.out.println("Maximum number is " +num1);
        } else if (num2 > num1) {
            System.out.println("Maximum number is " +num2);
        } else {
            System.out.println("Both are equal");
        }
    }
}

// java.lang package is always available. It is imported by default