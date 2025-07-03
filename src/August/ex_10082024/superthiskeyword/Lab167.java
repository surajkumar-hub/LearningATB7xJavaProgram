package August.ex_10082024.superthiskeyword;

public class Lab167 {
    // what is super keyword?
    //1. it can be used with Variables
    //2. it can be used with Methods
    //3. it can be used with constructors
    // super keyword in Java is a reference variable that allows a subclass (child class) to
    // refer to its parent class.

    public static void main(String[] args)
    {
        Car s = new Car();
        s.display();
    }
}

class Car extends Vehicle
{
    private int maxSpeed = 281; // maxSpeed variable is present both in child class as well as in parent
    // class. How can we differentiate or how can we access maxSpeed in parent class and child class?
    // By using "this" and "super" keyword. Check line no 34 & 35

    Car()
    {
        super(); // Here super() will call parent class constructor i.e. Vehicle().
        // This is called Constructor Chaining. Because here car() constructor is calling super(),
        // and super() is calling Vehicle() constructor.
        // super(10); // Here parent class parameterized constructor will be called i.e. Vehicle(int a)
        // By using super() keyword, we can call variable, method and constructor
        System.out.println("Default Constructor of Car");
    }
    public void display()
    {
        System.out.println("Car speed is -> "+ this.maxSpeed); // 281
        System.out.println("Vehicle speed is -> "+ super.maxSpeed); // 180
        super.message(); // Vehicle class message() will be called // Hello Vehicle
        this.message(); // Car class message() will be called // Hello Car
    }

    @Override
    void message() // Method Overriding
    {
        System.out.println("Hello Car");
    }

}

class Vehicle
{
    public int maxSpeed = 180;

    Vehicle()
    {
        System.out.println("Default Constructor of Vehicle");
    }
    Vehicle(int a)
    {
        System.out.println("Parameterized Constructor of Vehicle");
    }

    void message()
    {
        System.out.println("Hello Vehicle");
    }

    void message(int a) // Method Overloading
    {
        System.out.println("Hello Vehicle");
    }


}
