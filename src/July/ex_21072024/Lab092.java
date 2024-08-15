package July.ex_21072024;

public class Lab092 {
    public static void main(String[] args) {
        // Condition -> If else, switch ( We use switch when we have multiple conditions)
        // Loops Concept -> For, while, do while - perform a task multiple times
        // Also called as Iterative, repetition

        // Print from 1 to 10
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println("..");
        System.out.println(10);

        // This is not the write way to do this task

        // Loop here to perform a task which is repetitive in nature.

        // 1. for loop
        /** for(A;B;C)
        {
        Task which you want to perform multiple time.
        } **/

        // A - initialization
        // B - Condition for termination
        // C - increment / decrement -> updation


        for(int i=1;i <=10;++i)
        {
            // here is the code you want to execute
            System.out.println("Hi"+ i);
        }


    }
}
