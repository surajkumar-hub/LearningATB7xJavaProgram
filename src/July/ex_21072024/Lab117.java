package July.ex_21072024;

public class Lab117 {
    public static void main(String[] args) {
        // do while - while - 1 change - minor change

        /** Difference between while and do-while is- in while loop if condition is false statement
        // won't  be printed but in do-while loop statement will be printed once if condition is
         false **/

        // While -> initialization -> condition -> body -> increment / decrement

        // Do-While -> initialization  -> body -> condition -> increment / decrement

        // Difference

        int a = 0;
        do {
            System.out.println(a);
            a++;
        }while(a < 10);
    }
}
