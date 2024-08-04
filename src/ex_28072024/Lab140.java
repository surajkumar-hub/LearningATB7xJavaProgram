package ex_28072024;

public class Lab140 {
    public static void main(String[] args) {

        // OOPS is concept. Concept means certain rules has provided how user can solve a problem statement
        // When we have real life problem, we can solve that by using OOPS concept
        // Suppose creating a new planet
        // AHuman
        // Every human will have some attribute and behaviour
        // Attribute / Properties -> 2 hand, eye color, nose, mouth, height, weight, body color, hair color
        // Behaviour / Methods -> walk(), eat(), talk(), sleep(), read(), hear()
        // These attributes and behaviours are also called as blueprint
        // Amit - AHuman
        // Amit  - Attribute & Behaviour
        /** In OOPS concept, any blueprint is called as Class and the rela thing which is created from the
         // class is called as the object **/

        // In OOPS concept, any Blueprint is called as the Class
        // A class can have some properties (attributes) and functions (methods)

        /**
         * Let's take an example:
         * What is a class:
         * Suppose Person is Class
         * It has some attributes like - Name, Age, Gender, Occupation and it has some functionality or
         * behaviour such as - Walk(), Eat(), Sleep(), Work(). This is just a blueprint of a person.
         * This is not a real entity.
         **/

        // Now Person is a class
        // How can we create a real entity -> by creating an object
        // What is object - Real thing which is created from the class is called as Object

        Person person = new Person(); // Creation of Object
        person.name = "Amit"; // This is the real entity
        person.rollno = 1;

        Person person2 = new Person();
        person2.name = "Pramod";
        person2.rollno = 2;
    }
}


