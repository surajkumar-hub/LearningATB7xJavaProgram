package July.ex_21072024;

public class Lab111 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++)
        { // i = 1 to 100, times = 100
            System.out.println(i);
        }
        for (int i = 1; i <= 100; i=i+2) // It's Possible
        {
            System.out.println(i);
        }
        for (int i = 1; i <= 100; i=i+10) // It's Possible
        {
            System.out.println(i);
        }
        for (int i = 1; i <= 100; i=i+3) // It's Possible
        {
            System.out.println(i);
        }
        for (int i = 1; i <= 100; i=i+51) // It's Possible
        {
            System.out.println(i);
        }
        for (int i = 1; i <= 100; i=i/2+1) // It'll be infinite
        {
            System.out.println(i);
        }
    }

}
