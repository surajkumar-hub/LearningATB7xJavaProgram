package August.ex_04082024;

public class Person {
    String name;

    /* Now the default value of "name" is null. What if we assign the value whenever we create an
    object? There is special method in java, where method name is same as class name & with no return
    type. This is called constructor. */

       Person() // This method will be automatically called, when we type new Person();
       {
           System.out.println("Hi, I will be called, when object is created!");
       }


    void talk()
    {
        System.out.println("I am talking");
    }
}
