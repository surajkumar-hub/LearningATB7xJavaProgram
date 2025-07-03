package August.ex_10082024.superthiskeyword;

public class Lab169 {
    // If we want to call super class variable -> super.variable
    // If we want to call super class method -> super.method()
    // If we want to call default constructor of super class -> super()
    // If we want to call parameterized constructor of super class -> super("pramod")
    // If we want to call same class constructor - this()
    // If we want to call same class variable - this.variableName

}

class Person1 {
    Person1()
    {
        System.out.println("Person1 - DC");
    }

    Person1(String a)
    {
        System.out.println("Person1 - PC A1");
    }

    Person1(String a, int a1)
    {
        System.out.println("Person1  - PC A2");
    }
}
class Student1 extends Person1{
    int a = 10;

    Student1(String s)
    {
        System.out.println("PC - Student");
    }

    Student1()
    {
        super(); // Constructor Chaining
        // super("Pramod"); // It will call the PC A1 of parent class
        // super("Pramod", 12); // It will call the PC A2 of parent class
        // this("Pramod"); // It will call the PC of Student class but, we can't call like this as
        // super keyword has already been called
        System.out.println(this.a); // We can call like this bcoz here we are calling a variable not
        // a function. Super() is calling function and this is calling a variable.
    }
}
/** Note:
 1. We can't use multiple "super" keyword. Only 1 super() keyword we can use.
 2. We can't call more than 1 constructor.
 3. We can't call "this" keyword multiple times.
 4. We can't call child class constructor and parent class constructor in the same class. Only one of
 type is allowed. Means we can call either child class constructor or parent class constructor **/