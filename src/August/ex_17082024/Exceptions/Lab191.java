package August.ex_17082024.Exceptions;

public class Lab191 {
    public static void main(String[] args) {
        System.out.println("Start of the program");

        String ip = args[0]; // ArrayIndexOutOfBoundsException - if we don't enter any arguments
        int a = Integer.parseInt(ip); // NumberFormatException - if we enter string (Pramod)
        int b = 1000 / a; // ArithmeticException - If we enter 0 bcoz we can't divide by 0
        System.out.println(b);
        System.out.println("End of the program");

        // Below is the execution flow of this program:
        //JVM will be Initialized
        //It creates and starts the main thread & main thread will call the main()
        // The we"ll collect the Command Line Arguments (String[] args)
        // Creates the String array with CLI
        // Then it"ll call Lab209 and the value that we have passed i.e. main(0)
        // Now control will be transferred from main thread to main method
        // When problem comes in main -> JVM will raise the exceptions
        // If we don't handle the exception, JVM basically creates an exception object -
        // [Exception a=new Exception()] and terminate the program
    }
}
// If we enter 0 as an argument in String[] args then this will be the o/p:
// Exception in thread "main" java.lang.ArithmeticException: / by zero

// We"ll get this exception "ArrayIndexOutOfBoundsException", when there"ll be no value for that index
// We"ll get this exception "NumberFormatException" when we try to convert String value into int
// We"ll get this exception "ArithmeticException" when we pass 0 as an argument in String[] args