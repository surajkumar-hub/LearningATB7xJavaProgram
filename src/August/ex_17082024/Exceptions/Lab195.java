package August.ex_17082024.Exceptions;

public class Lab195 {
    public static void main(String[] args) {
        try {
            String s1 = "Pramod";
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            // System.out.println("Something went wrong!");// This is not a good code. We should give
            // proper message to the user
            System.out.println("There is some problem with the code");
            System.out.println(e.getMessage()); // This is used to get proper message
        }


        System.out.println("End of Program!");
    }
}
