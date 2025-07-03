package August.ex_11082024.Abstraction.exLoan;

public class Lab171 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50K();

        // Father f1 =  new Father(); // We can't create an object of the abstract class
        Father f1 = new Son(); /** This is called Dynamic Dispatch and it is possible as we are creating
        an object of Son class which is not an abstract class **/
        f1.loan25k();
        f1.loan50K();
    }
}

/** Abstraction is basically used to hide the important methods as well as classes.
 We can achieve abstraction by creating some incomplete classes using abstract keyword and they will
 have some incomplete methods. Now we"ll create a concrete class, where all these methods will be
 extended and this concrete class will give definitions to all these abstract methods. This is the
 concept of abstraction **/
