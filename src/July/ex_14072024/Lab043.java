package July.ex_14072024;

public class Lab043 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
        //int total_price = course+GST; // Implicit Narrowing - JVM
        int total_price = course+(int)GST; // Explicit narrowing - REAL time - money loss
        System.out.println(total_price);



    }
}
