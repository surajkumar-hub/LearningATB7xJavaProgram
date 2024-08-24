package August.ex_10082024.Encapsulation;

public class Lab164 {
    public static void main(String[] args) {

        ICICIBank amit = new ICICIBank("Amit",100);
        // I want to set the balance
        // But only admin can set the balance

        // amit.name = "dasdd"; // With reference not allowed. have to use setter method
        amit.setBal(1000000000,false);
        //amit.setBal(); // not possible
        System.out.println(amit.getName()); // Allowed
        System.out.println(amit.getBal(false)); // Not Allowed

        // Here we"ll Write some condition for admin
        boolean are_you_admin = true;


        ICICIBank admin = new ICICIBank("admin",1000);
        admin.setBal(50000,true);
        System.out.println(admin.getName());
        System.out.println(admin.getBal(are_you_admin));

    }
}
// Getter and setter will basically help us to get or set the value via the methods only not with
// the reference

/** Advantages of Encapsulation:
 1. Data Hiding
 2. Increased Flexibility - We can make the variables of the class read only or write only depending
 on requirement
 3.Security
 4.
 */