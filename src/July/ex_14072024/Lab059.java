package July.ex_14072024;

public class Lab059 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; // SCP
        String name1 = "The Testing Academy"; // SCP

        String name2 = new String("The Testing Academy"); // Heap area (OA)
        String name3 = new String("The Testing Academy"); // Heap area (OA)

        System.out.println(name == name1); // == check the Ref
        System.out.println(name.equals(name1)); // equals() check the Content


        System.out.println(name1 == name2); // Check for the Ref
        System.out.println(name1.equals(name2)); // Check for the Content
    }
}
