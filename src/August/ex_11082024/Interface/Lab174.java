package August.ex_11082024.Interface;

public class Lab174 {
    public static void main(String[] args) {
        // I i = new I(): // Not Possible

    }
}

interface I{}
class A{} // It's a concrete class
class B{} // It's a concrete class
abstract class C{} // Non-Concrete Class
class Test1 extends  A{} // It's a type of single inheritance
class Test2 extends B{} // It's valid
// class Test3 extends A,B{} // It's invalid because Multiple Inheritance is not supported in java
class Test0 implements I{} // It's valid
interface I1{} // Valid
interface I2{} // Valid
class Test4 implements I1,I2{} // This is possible. Multiple Inheritance with interface is supported
class Test5 extends A implements I1,I2{} // It's possible
//class Test6 implements I1 extends A{} // Not possible because first has to be extends
//interface I3 extends A{} // Not possible because interface can't extends anything
//interface I4 implements A{} // Not possible because here A is a concrete class
//interface I5 extends A,B{} // Not possible because here both A & B are concrete class
interface I6 extends I1,I2{} // Possible
//interface I7  extends C{} // Not possible

