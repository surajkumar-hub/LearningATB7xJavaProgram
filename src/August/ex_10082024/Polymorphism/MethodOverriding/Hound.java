package August.ex_10082024.Polymorphism.MethodOverriding;

public class Hound extends Dog {

    // void bark()
    // {
    // System.out.println("I am Dog, i will Bark!!");
    // }

    @Override
    void bark()
    {
        System.out.println("I am Hound, i will Bark!!");
    }

    void bike()
    {
        System.out.println("Biked");
    }
}

/** If we call bark(), then JVM will get confused, which bark() should be called. Whether Dog class
 method will be called or Hound class method. Because as Hound extends Dog class, all the methods
 and variables will be automatically created in Hound class. To overcome this we should add
 something called @override. @Override means this is a overridden function
 */
