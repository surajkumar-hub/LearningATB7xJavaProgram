package August.ex_24082024;

// Set Concept

import java.util.*;

public class Lab223 {
    public static void main(String[] args) {
        // List - > Duplicate Allows
        // Set -> Doesn't allow Duplicate
        Set hs = new HashSet();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add(null);
        System.out.println(hs);
        // HashSet uses Hashing mechanism to store the element. Disadvantage is -> no order

        Set lhs = new LinkedHashSet();
        lhs.add("Apple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());
        // LinkedList mechanism to store the element. In this case order will be maintained


        Set ts = new TreeSet();
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Orange");
        ts.add("WaterMelon");
        // ts.add(null); Not Allowed because TreeSet do the Sorting but we do sorting with null? No
        System.out.println(ts);
        // It uses Black and Red Tree mechanism to store the element. Here order will be maintained
        // Black and Red Tree mechanism means it"ll automatically sort based on the 1st letter
        // If we need to sort the element automatically, we have ti use TreeSet

        // How do we print the Set
        for (Object s : ts) {
            System.out.println(s);
        }

        Iterator it = ts.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
