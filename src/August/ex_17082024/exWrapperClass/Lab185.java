package August.ex_17082024.exWrapperClass;

public class Lab185 {
    public static void main(String[] args) {
        Car c = new Car("Lambo");
        c.drive();
        // System.out.println(c.make); // Can't access because of private
        // This is how we can access the inner class - This is inner class object creation -
        Car.GearBox cg = c.new GearBox();
        cg.m2();


    }
}
class Car {
    private String make;
    public Car(String make)
    {
        this.make = make;
    }
    // Method
    void drive()
    {
        System.out.println("You can driver Car");
    }

    class GearBox {
        void m2()
        {
            System.out.println("m2");
        }
        class NutBolts
        {

        }
    }
}
// We add inner class only for security purpose
// Inner class is basically created to hide the functionalities
