package ex_20072024;

import java.sql.SQLOutput;

public class Lab082 {
    public static void main(String[] args) {
        // JDK > 13

        int itemcode = 006;
        switch (itemcode) {
            case 001, 002, 003: // // Multiple condition in same case is now supported
                System.out.println("It is Electronic Gadget!");
                break;
            case 004, 005, 007:
                System.out.println("It is Mechanical Gadget!");
                break;
            default:
                System.out.println("None");
        }
    }
}

/** This another way of writing code by using multiple condition in same case
        switch (user_input)
 {
        case 'a', 'e', 'i', 'o', 'u':
        System.out.println("Vowel");
        break;
        default:
        System.out.println("Not a Vowel, It is Consonant");
 } **/

// here we can't use arrow (->) operator because System.out.println("") statement we can't print


