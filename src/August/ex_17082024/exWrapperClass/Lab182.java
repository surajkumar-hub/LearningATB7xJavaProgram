package August.ex_17082024.exWrapperClass;

public class Lab182 {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        a.age =  12;
        System.out.println(A.discount);
        a.m2();
        A.m1(); // Static doesn't need object reference
    }
}

class A{
    int age  = 10; // Instance variable
    static int discount = 199; // static variable

    // SIB - STATIC Initialization Block
    static {
        System.out.println("One Time Load SIB");
    }

    // IIB - Instance Initialization Block
    {
        System.out.println("IIB - When Object is created");
    }

    static void m1()
    {
        System.out.println("m1");
       // System.out.println(age); // We can't use a non-static variable in a static block
    }
    void m2()
    {
        System.out.println("m2");
        System.out.println(discount); // We can use a static variable inside a non-static block
    }
}

/** O/P:
One Time Load SIB
IIB - When Object is created
IIB - When Object is created
199
m2
199
m1 **/