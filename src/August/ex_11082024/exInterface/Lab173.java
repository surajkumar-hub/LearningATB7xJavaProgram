package August.ex_11082024.exInterface;

public class Lab173 {
    // Interface is also used to hide the implementation
    // Interface variables will be inherited to subclasses
    // interface is a keyword which is used to define user defined datatypes or a new class


    public static void main(String[] args) {
//        Engine e = new Engine(); // We can't create an object of interface
        WagonR r = new WagonR();
        r.drive();
    }
}
