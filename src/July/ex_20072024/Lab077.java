package July.ex_20072024;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {
        // If Else - Condition  ( If, else If , else) - multiple condition

        // Switch - Better option if we have 2+ condition
        // Which day it is - Suppose user enters a day from 1 to 7
        // 3 -> Wed

        // MTWTFSS

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7, Tell What day it is");
        int day = sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea, what day it is!");
                break;
        }

        //System.out.println("  ---- === Outside the Switch loop === -----");
    }
}
