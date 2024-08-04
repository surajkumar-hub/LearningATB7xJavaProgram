package ex_21072024;

public class Lab106 {
    public static void main(String[] args) {
        // Loop with condition
        // Exit the moment when i==5
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
            if (i == 5)
            {
                break; // break can be used only there is a condition and it is used to go out of the
                // loop. It"ll stop iterating and terminate the loop
            }


        }

        // i = 1 -> 1
        // i = 2 -> 2
        // i = 3 -> 3
        // i = 4 -> 4
        // i = 5 -> Out of loop

    }
}
