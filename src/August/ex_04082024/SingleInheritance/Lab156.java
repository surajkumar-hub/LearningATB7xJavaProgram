package August.ex_04082024.SingleInheritance;

public class Lab156 {
    public static void main(String[] args) {
        Son s = new Son();
        s.bhk3();
        s.bhk2();

        Father f1 = new Father();
        f1.bhk2();
        // f1.bhk3(); Invalid
    }
}
