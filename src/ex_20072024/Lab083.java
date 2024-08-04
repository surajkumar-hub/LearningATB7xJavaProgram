package ex_20072024;

public class Lab083 {
    public static void main(String[] args) {
        int itemCode = 001;

        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!"); // In this case break is not necessary
            // because here we have used arrow (->) operator
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }
    }
}
