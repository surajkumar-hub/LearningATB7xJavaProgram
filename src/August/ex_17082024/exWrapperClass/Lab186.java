package August.ex_17082024.exWrapperClass;

public class Lab186 {
    public static void main(String[] args) {
        // Example of Anonymous Class

        ABC a = new ABC() {
            @Override
            public void m1()
            {
                System.out.println("m1");
            }

            @Override
            public void m2()
            {
                System.out.println("m2");
            }
        };

        CBA a1 = new CBA() {

            @Override
            void m3()
            {
                System.out.println("M3");
            }
        };

    }
}
interface ABC{
    void m1();
    void m2();
}

abstract class CBA{
    abstract void m3();
}

// We can create an object of interface and abstract class by using Anonymous Class
