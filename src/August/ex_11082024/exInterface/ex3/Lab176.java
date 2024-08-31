package August.ex_11082024.exInterface.ex3;

public class Lab176 {
    public static void main(String[] args) {
        Car c  = new Car();
        c.start();
        c.m1();
    }
}

interface Engine{
    void start();
    default void m1() // It is available to all
    {
        System.out.println("Old M1");
    }

    default void suite()
    {
        System.out.println("wear suite");
    }
}

interface GearBox extends Engine{
    void gear();
}

interface Keys extends GearBox{
    void openCar();
}

class Car implements Keys {

    @Override
    public void start()
    {
        System.out.println("Starting");
    }

    @Override
    public void gear()
    {

    }

    @Override
    public void openCar()
    {

    }
}
