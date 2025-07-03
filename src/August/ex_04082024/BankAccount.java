package August.ex_04082024;

import java.sql.SQLOutput;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode; // Instance Variable

    // Default Constructor
    BankAccount()
    {
        bankName = "SBI";
        balance = 0;
        bankCode = "SBI001";
    }

    // Parameterized Constructor with 3 Arguments
    BankAccount(String bName, int bal, String bCode)
    {
        this.bankName = bName;
        this.balance = bal;
        this.bankCode = bCode;
    }

    // Parameterized Constructor with 2 Arguments
    BankAccount(String bName,int bal)
    {
        this.bankName = bName;
        this.balance = bal;

    }

    // Parameterized Constructor with 1 Argument
    BankAccount(String bName)
    {
        this.bankName = bName;
    }

    void printDetails()
    {
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bal ->" + balance);
    }
}

