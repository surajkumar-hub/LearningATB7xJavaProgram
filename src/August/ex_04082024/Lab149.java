package August.ex_04082024;

public class Lab149 {
    public static void main(String[] args) {
        // Default Constructor (DC)
        Car c1 = new Car();
        // ClassName objectRef =  new keyword + ClassName();

        new Car(); // it's valid and here default constructor will be called because a new object
        // is created

        // Car c1; Here default constructor won't be called because car() function is not called
        // If we don't type "new" keyword then constructor won't be called
    }

}
