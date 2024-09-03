package August.ex_17082024.exWrapperClass;

public class Lab181 {
    public static void main(String[] args) {
        Double d = 3.14; // Stored in Heap Area
        double val = d.doubleValue(); // Stored in Continuous Memory
        System.out.println(d);
        System.out.println(val);

        String s1 = "pramod"; // Stored in SCP
        String s2 = new String("pramod"); // Stored in Heap Area
    }
}
