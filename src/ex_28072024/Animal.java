package ex_28072024;

public class Animal {
    // String name; // Default value is null
    String color; // Default value is null
    String name = "LOL";


    void walk(){}
    void talk(){}

    public static void main(String[] args) {
        // Animal animal = new Animal();
        // animal.name = "Dog";
        Animal animalRef  = null; // here animalRef will be pointing towards null area. No objects will
        // be created here
        // What is null area - Null is a special area in JVM
        Animal animalRef2  = new Animal();
        Animal animalrRef3 = new Animal();
        Animal animalRef4  = animalRef2;
        /** Here only two objects are created i.e. animalRef2 & animalRef3.
         animalRef4 will be pointing towards animalRef2  **/

        System.out.println(animalrRef3.name);
    }
}
