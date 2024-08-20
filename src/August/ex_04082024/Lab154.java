package August.ex_04082024;

import java.util.Scanner;

public class Lab154 {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        System.out.println(ba1.bankName);
        System.out.println(ba1.balance);
        System.out.println(ba1.bankCode);
        // Here default constructor has been used

        BankAccount baicici = new BankAccount("ICICI", 100, "ICICI0001");
        // Here parameterized constructor has been used
        // Why parameterized constructor are used - If we initialize the values with the default
        // values before starting the program, we need to use parameterized constructor

        baicici.printDetails();
        ba1.printDetails();

        // Get the details from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name of the Bank!");
        String bName = sc.next();
        System.out.println("Enter your bank balance!");
        int bal = sc.nextInt();
        System.out.println("Enter your bank code!");
        String bCode = sc.next();

        BankAccount icici = new BankAccount(bName, bal, bCode);
        icici.printDetails();
        sc.close();

    }
}
