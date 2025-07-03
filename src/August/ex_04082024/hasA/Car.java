package August.ex_04082024.hasA;

public class Car {
    // Aggregation Concept - hasA Relationship
    protected void StartTheCar()
    {
        new Engine().start();
        new Tyre().rolling();
        // Here by using an object of Engine class and Tyre class we used those class methods
        // If we don't want to use inheritance, then we can use objects directly by using has a
        // relationship
    }
}
