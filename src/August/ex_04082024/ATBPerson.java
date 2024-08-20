package August.ex_04082024;

public class ATBPerson {
    String name;
    long phone;

    // Default Constructor
    ATBPerson()
    {
        System.out.println("Object is created!");
    }
    // Parameterized Constructor
    ATBPerson(String nameGiven)
    {
        this.name = nameGiven;
        // this keyword basically means current class and it is mandatory to use
    }

    ATBPerson(String nameGiven,long phoneNumber){
        this.name = nameGiven;
        this.phone = phoneNumber;
    }
}
