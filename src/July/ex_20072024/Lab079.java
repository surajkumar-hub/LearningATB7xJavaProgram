package July.ex_20072024;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {
        // Take a user input as char and Tell the user if it is a vowel
        // aeiou

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you, If it is a vowel or not!");
        char user_input = sc.next().charAt(0); // This is how we can take character input
        System.out.println(user_input);

        switch (user_input) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It is a Consonant");

        }
        // This another way of writing code by using multiple condition in same case
        switch (user_input) {
            case 'a', 'i', 'o', 'u', 'e':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It is Consonant");

        }
    }
}
