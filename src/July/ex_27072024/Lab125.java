package July.ex_27072024;

import java.util.Scanner;

public class Lab125 {
    public static void main(String[] args) {

        // There is another way to create an array i.e. by using "New" keyword
        // Arrays -> new
        int[] marks = new int[3]; // Here no values are stored. So default value is zero
        // index - 0,1,2
        // length - 3
        System.out.println(marks[0]); // 0
        System.out.println(marks[1]); // 0
        System.out.println(marks[2]); // 0
        marks[0] = 91;
        marks[1] = 92;
        marks[2] = 93;
        System.out.println(marks[0]); // 91
        System.out.println(marks[1]); // 92
        System.out.println(marks[2]); // 93
        System.out.println(marks[10]); // ArrayIndexOutOfBoundsException

        // Add the values by using scanner class
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);


        boolean[] is_married = {true, false, true};
        // How to traverse in an array?
        // By using for loop
        for (int i = 0; i < marks.length; i++) {
            // value of i = 0,1,2
            System.out.println(i + " -> " + marks[i]);
        }


        String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println(weekDays[i]);
        }
    }
}
