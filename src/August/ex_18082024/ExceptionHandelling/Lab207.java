package August.ex_18082024.ExceptionHandelling;

//equalsIgnoreCase() Concept

public class Lab207 {
    public static void main(String[] args) {
        // String name = "Pramod"; // By using equalsIgnoreCase it"ll be taken as pramod
        String name = "Dramod";
        String name2 = "pramod"; // pramod
        if (name.equalsIgnoreCase(name2)){ //equalsIgnoreCase will ignore the case-sensitive
            System.out.println("Equal");
        }else {
            System.out.println("Not EQUAL");
        }

        // final -> constant
        // finally -> block of code with the try and catch
        // finalize -> Object class function - Used in threading

    }
}
