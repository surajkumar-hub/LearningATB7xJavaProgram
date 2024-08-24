package August.ex_10082024.superthiskeyword;

public class Lab169 {
    // If we want to call super class variable - super.variable
    // If we want to call super class method - super.method()
    // If we want to call default constructor of super class - super()
    // If we want to call parameterized constructor of super class - super("pramod")

    // If we want to call same class constructor - this()
    // If we want to call same class varibale - this.variableName

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
        System.out.println("PC -Student");
    }

    Student1()
    {
        super(); // Constructor Chaining
        // this("Pramod"); // Can't call as super keyword has been already called
        System.out.println(this.a); // We can call this bcoz here we are calling a variable not function
        //super("Pramod");
        //super("pramod",12);
    }
}
/** Note:
 1. We can't use multiple super keyword. Only 1 super() keyword we can use.
 2. We can't call more than 1 constructor.
 3. We can't call this keyword multiple times.
 4. We can't call child class constructor and parent class constructor in the same class. Only one of
 type is allowed. Means we can call either child class constructor or parent class constructor **/