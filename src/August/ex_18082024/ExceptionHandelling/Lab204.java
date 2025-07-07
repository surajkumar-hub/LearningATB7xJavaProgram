package August.ex_18082024.ExceptionHandelling;
import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        if (name.equalsIgnoreCase("Pramod")){
            try {
                throw new Exception("Not allowed!!"); // Custom exception using throw keyword
            } catch (Exception e) {
                System.out.println("Exception!!");
            }
        }else {
            System.out.println("Allowed!");
        }
    }
}
