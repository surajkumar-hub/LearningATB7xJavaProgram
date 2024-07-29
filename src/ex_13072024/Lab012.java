package ex_13072024;

public class Lab012 {
    public static void main(String[] args) {
        System.out.println("9x1=9");
        System.out.println("9x2=18");
        System.out.println("9x10=90");

        // This is not a good way to write like this

        // There is a separate command called formatting

        // Formatting
        int age = 98;
        System.out.println("Your age is -> " + age);
        // O/P will be Your age is -> 98

        // %d ->  If we are using any of the integer like - byte, short, int or long, then use %d
        // %s -> For String
        // %c -> For char
        // %f -> For float
        System.out.printf("You age is -> %d",age); //Here age value will be replaced to d
        System.out.println();

        // Where do we need to use this?
        //When we need to replace a value
        int n = 9;
        System.out.printf("%d",n);

        /**O/P :
        9x1=9
        9x2=18
        9x10=90
        Your age is -> 98
        You age is -> 98
        9 **/


    }
}
