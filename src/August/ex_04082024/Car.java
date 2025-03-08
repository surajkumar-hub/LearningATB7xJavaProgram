package August.ex_04082024;

import java.sql.SQLOutput;

public class Car {
    // DC
    Car() {
        System.out.println("Starting");

        // What is the purpose of this default constructor?
        // Here we can write anything or code which we want to execute before starting

        System.out.println("Reading data from MySQL");
        System.out.println("Reading data from CSV");
        System.out.println("Reading data from Excel");
    }
    /** Car()
     {
        System.out.println("Starting");
    }
    We can't create another function like this because we can create only one default constructor **/


    void Dog()
    {
        // Here Dog() is not a constructor because it's name is not same as it's class name
    }
}
