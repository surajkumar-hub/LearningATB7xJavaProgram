package August.ex_04082024;

public class Lab150 {
        // int age2 = 45; // Instance Variable
        int e = 45; // Instance Variable
        // life of "age2" or "e" variable is within this class
        // Instance Variable != Global Variable


        void f1()
        {
            int e = 10; // Here "e" is a local variable. Life of this "e" is within this function
            // Local variable means local to that function
            System.out.println(e); // O/P: 10
        }

        void f2() {
    // System.out.println(e);Here we can't print the "e" value of f1 function as it is a local variable
            // to the f1 function
            // e = 50;
            // System.out.println(e); // O/P: 50
            System.out.println(e); // O/P: 45
        }
    }

