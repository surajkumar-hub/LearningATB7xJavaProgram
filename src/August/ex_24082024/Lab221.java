package August.ex_24082024;

//toString() concept

public class Lab221 {
    public static void main(String[] args) {
        Person p1 = new Person("Pramod","KA");
        Person p2 = new Person("Lucky","New Delhi");
        System.out.println(p1);
        System.out.println(p2);
    }
}

class Person extends Object{
    String name;
    String address;

    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "ID ->" + name +  " , Address -> " + address;
    }
}
/** There is a toString() function in the object class. We can override this function and give our
 * implementation. If we don't give implementation, by default it"ll print ->
 getClass().getName() + "@" + Integer.toHexString(hashCode())
 */
