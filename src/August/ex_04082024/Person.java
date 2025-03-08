package August.ex_04082024;

public class Person {
    String name;

    // Special method
       Person() // This method will be automatically called, when we type new Person();
       {
           System.out.println("Hi, I will be called, when object is created!");
       }


    void talk()
    {
        System.out.println("I am talking");
    }
}
