package July.ex_20072024;

import java.util.Scanner;

public class Lab072 {
    public static void main(String[] args) {
        // Take user input and check if number is even or odd.
         // Logic Building
        // Step 1. Figure out the inputs &  // 2. Data type
        //  Data type  - int
        // How to take input in the Java? - By using Scanner class
        // Which function will give us assignment - nextInt() -> input
        // 3. Do we need conversion or directly
        // 4. Rough logic - num%2==0 even or odd
        // 5. optimize
        // int - size - 32 bit -> range( 2,147,483,647)

        Scanner sc = new Scanner(System.in); // Object creation of the scanner Class - OOPs

        System.out.println("Enter the number");

        int user_input = sc.nextInt();
        // whatever value user will enter nextInt() function will assign that value to user_input variable

        System.out.println(user_input);

        if(user_input%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
