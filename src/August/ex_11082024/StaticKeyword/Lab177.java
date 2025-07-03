package August.ex_11082024.StaticKeyword;

public class Lab177 {
    // Static can be a data member, a Function, a Class, and a block

    public static void main(String[] args) {
       /** ATB a1 = new ATB("amit");
        System.out.println(a1.getName());
        ATB a2 = new ATB("Pramod");
        System.out.println(a2.getName());
        ATB.doAssignment(); // To call this method no need to create any object because it is static
        System.out.println(ATB.courseName); **/

       ATB a1 = new ATB("amit"); // O/P - IIB
        /** The moment we create an object below line will be called automatically -
        System.out.println("IIB");
        ATB a1 = new ATB("amit");
        The moment we load the class i.e. ATB, static block will be called automatically and the
         moment when we create an object i.e. new ATB(); IIB will be called automatically
         and the moment we called like this - new ATB("amit") parameterized constructor will be called
         **/
    }

}


class ATB{

    {
        System.out.println("IIB"); // IIB: Instance Initialization Block
        // What is the purpose of this?
        // Here we can write code related to -
        // for ex- If we want start a website or anything before starting the web automation or
        // api automation. For ex -
        System.out.println("Reading from CSV file");
    }

    static
    {
        System.out.println("This static block wilL be called automatically when we load the class");
    }

    private String name;
    private String phone;// Phone no can't be static as it should be different for everyone
    static String courseName = "ATB";// We can use static when there is a common attribute between the objects


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ATB(String name)
    {
        this.name = name;
    }
    /** static public ATB(String name)
    {
        this.name = name;
    } Constructor can't be static **/

    static void doAssignment()
    {
        System.out.println("Do Assignment");
    }

    static class A
    {
        // Class within the class is also possible
    }
}
