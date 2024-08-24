package August.ex_10082024.superthiskeyword;

public class Lab167 {
    // what is super keyword
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
    private int maxSpeed = 281;

    Car()
    {
        super(); // This is called Constructor Chaining. Because here car() constructor is calling
        // super(), which is calling Vehicle() constructor.
        // Here super() will call parent class constructor i.e. Vehicle()
        // super(10); // Here parent class parameterized constructor will be called -> Vehicle(int a)
        System.out.println("Default Constructor of Car");
    }
    public void display()
    {
        System.out.println("Car speed is -> "+ this.maxSpeed);
        System.out.println("Vehicle speed is -> "+ super.maxSpeed);
        super.message(); // Vehicle class message() will be called
        this.message(); // Car class message() will be called
    }

    @Override
    void message() // Method Overriding
    {
        System.out.println("Hello Vehicle");
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
