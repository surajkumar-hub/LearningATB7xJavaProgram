package July.ex_28072024;

public class Lab141 {
    public static void main(String[] args) {
        //  Class - Attribute / properties - is nothing but datatypes - primitive or non-primitive
        // Class - Behaviour /Methods - is nothing but functions
        // object - is nothing but a real entity which is created from a class
        /** syntax of creating an object:
        ClassName classRef = new ClassName(); **/

        // new ClassName(); is the Object
        // classRef - Class Ref
        // ClassName = Class Name is basically which blueprint we are using




        BuildingBP dlfRef = new BuildingBP();
        dlfRef.name = "DLF Pvt Builder";
        dlfRef.noOfRooms = 100;
        dlfRef.useLift();

        BuildingBP prestigeRef = new BuildingBP();
        prestigeRef.name = "Prestige Pvt Builder";
        prestigeRef.noOfRooms = 100;
        prestigeRef.useLift();

    }
}
