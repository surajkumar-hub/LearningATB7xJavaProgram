package July.ex_21072024;

public class Lab121 {
    public static void main(String[] args) {
        // Functions -> Block of code which we can reuse
        // 1. Pre-built - Math.max()
        // 2. User created / defined

        // There are two components of the functions
        // 1. We have to define
        // 2. We have to call the function

        // Call the function
        for (int i = 0; i < 5; i++)
        {
            greet();
        }

        greet2();

    }
    // 1. Define the function
    static void greet()
    {
        System.out.println("Hi, How are you?");
    }

    static void greet2()
    {
        System.out.println("greet2");
    }
    // We can't write this function inside main() because function inside a function isn't allowed

    }

