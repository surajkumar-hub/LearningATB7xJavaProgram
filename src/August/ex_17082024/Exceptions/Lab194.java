package August.ex_17082024.Exceptions;

public class Lab194 {
    public static void main(String[] args) {
        System.out.println("Start of the program");
//        String ip = null; // ArrayIndexOutOfBoundsException
//        try {
//            ip = args[0];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new RuntimeException(e);
//        }
//        int a = 0; // NumberFormatException
//        try {
//            a = Integer.parseInt(ip);
//        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
//        }
//        int b = 0; // ArithmeticException
//        try {
//            b = 1000 / a;
//        } catch (ArithmeticException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(b);
//        System.out.println("End of the program");

        // Instead of 3 try / catch block we can surround all 3 expression with try /catch block

        int b = 0; // ArithmeticException
        try {
            String ip = args[0]; // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            b = 1000 / a;
        } catch (ArithmeticException| NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("End of the program");
        // This is better than above line of code
    }
}
