package August.ex_04082024;

public class Lab150 {
        // int age2 = 45; // Instance Variable
        int e = 45; // Instance Variable
        // life of age2 or e variable is within this class
        // Instance Variable != Global Variable


        void f1()
        {
            int e = 10; // Here e is a local variable. Life of this "e" is within this function
            // Local variable means local to that function
            System.out.println(e);
        }

        void f2()
        {
            e = 50;
            System.out.println(e);
        }
    }

