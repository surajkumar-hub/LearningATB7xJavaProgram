package August.ex_18082024.CollectionFramework;



import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab216 {
    public static void main(String[] args) {
        List mylist1 = new ArrayList(5); // Father Reference - Child Object - Possible
        mylist1.add("Pramod");
        mylist1.add("Anusha");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        System.out.println(mylist1);

        // Vector Concept

        Vector v = new Vector();
        v.add("Pramod"); // t1
        v.add("Anusha"); // t1
        v.add("Kiran"); // t1
        System.out.println(v);
        // Only Problem with the Vector is it is Thread Safe and synchronised means it is time-consuming
        // It"ll execute one by one
        // Slower

    }
}
