package ex_27072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab132 {
    public static void main(String[] args) {
        // All the Functions are present in Stack memory
        // Where we take the user input of the 5 subjects and print avg of the subject.
        // Figure out inputs - float, scanner class to take input

        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];
        /** System.out.println("Enter the marks of subject 1");
        marks[0]= sc.nextFloat();
        System.out.println("Enter the marks of subject 2");
        marks[1]= sc.nextFloat();
        System.out.println("Enter the marks of subject 3");
        marks[2]= sc.nextFloat();
        System.out.println("Enter the marks of subject 4");
        marks[3]= sc.nextFloat();
        System.out.println("Enter the marks of subject 5");
        marks[4]= sc.nextFloat(); **/

        // Instead of this we can use for loop

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of the sub " + (i + 1));
            marks[i] = sc.nextFloat();
        }

        /** Optionally, you can print out the marks to verify input
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of sub " + (i + 1) + ": " + marks[i]);
        } **/


        float avg = (marks[0]+ marks[1]+ marks[2]+ marks[3]+ marks[4])/5;
        System.out.println("Avg is -> "+avg);

        // We can use while loop also

        int j = 0;
        while (j < marks.length){
            System.out.println(marks[j]);
            j++;
        }

        sc.close();

    }
}
