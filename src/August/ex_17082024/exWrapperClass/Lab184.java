package August.ex_17082024.exWrapperClass;

public class Lab184 {
}
    // Nested Class  - Rarely you will be using it

    class OuterClass {
        Integer a = 10;
        void OC_m1()
        {
            // System.out.println(b); // Not possible

            System.out.println("OC_M1");
        }

        static class P {

        }


        class InnerClass {
            Integer b = 20;
            void Inner_m2()
            {
                System.out.println(a); // Adv of inner class is they can access outer class instance variable
                System.out.println("IC_M2");

            }
        }
    }
