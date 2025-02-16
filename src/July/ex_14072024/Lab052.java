package July.ex_14072024;

public class Lab052 {
    public static void main(String[] args) {
        String name = "Pramod";
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("Pramod");
        // How many ways we can a String - 2 ways
        // = , new operator
        // = Store the value in "SCP" // Sting constant Pool
        // new - Store the value in Objects format (heap)

        System.out.println(name.toLowerCase()); // String will be converted in to lower case
        System.out.println(name.length()); // Display the length of the string
        System.out.println(name.toUpperCase()); //String will be converted in to upper case
        System.out.println(name.charAt(2)); //
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(10)); // Exception Index 10 out of bounds
    }
}
