package ex_21072024;

public class Lab098 {
    public static void main(String[] args) {
        final boolean b1 = true;
        // b1 = false; final this is fixed now
//        for (int i=0; b1; i++)
//        {
//            System.out.println("Hello");
//        } // In this case the loop will run for infinite times

//        for (int i=0)
//        {
//            System.out.println("Hello");
//        } // In this case also the loop will run for infinite times

//        for (;;)
//        {
//            System.out.println("Hello");
//        } // In this case the loop will run for infinite times

        // No condition means infinite loop

        for(float f=0.0f;f<10.67;f++)
        {
            System.out.println("Hi,Float -> "+ f);
        }

        for(byte f=0;f<10.67;f++)
        {
            System.out.println("Hi,Float -> "+ f);
        }

    }
}
