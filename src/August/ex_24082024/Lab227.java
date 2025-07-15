package August.ex_24082024;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab227 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<>(); // Before Map we had something called Hashtable
        // Hashtable is also a Map, but it doesn't allow null
        // and it is Synchronised means Slow
        // and it is Legacy Class

        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        // To print this there is a Enumeration
        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements())
        {
            System.out.println(ht1.get(e.nextElement()));
        }

    }
}