package ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        // Program to Check if a Number is Positive, Negative   or Zero.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yur number!");
        int num = sc.nextInt();


        if(num> 0 ){
            System.out.println("It's a positive number");
        }else if( num < 0){
            System.out.println("It's a negative number");
        }else{
            System.out.println("It's zero");
        }
    }
}
