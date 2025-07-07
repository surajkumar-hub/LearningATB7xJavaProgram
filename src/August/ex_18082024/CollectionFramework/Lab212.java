package August.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab212 {
    public static void main(String[] args) {
        List mylist = new ArrayList(); // Most of the time  we use like this
        // ArrayList myList2 = new ArrayList(); // This is also fine
        mylist.add("Pramod");
        mylist.add("Anusha");
        mylist.add("Kiran");
        mylist.add("Pramod"); // Duplicate
        mylist.add("Pramod");
        // These are the in-built functions available in the Arraylist - add, remove, clear, contains,
        // indexOf, isEmpty, size, get, addAll, removeAll, retainAll, containsAll

        // To find all the functions of ArrayList type this in cmd - javap java.util.ArrayList

        System.out.println(mylist); // [Pramod, Anusha, Kiran, Pramod, Pramod]
        System.out.println(mylist.size()); // 5
        mylist.remove("Pramod");
        // Removes the first occurrence of the specified element from this list,
        System.out.println(mylist); // [Anusha, Kiran, Pramod, Pramod]
        mylist.clear();
        System.out.println(mylist); // []
        System.out.println(mylist.isEmpty()); // true

        mylist.add("Pramod");
        mylist.add("Anusha");
        mylist.add("Kiran");
        mylist.add("Pramod"); // In case of List Duplicate is allowed
        mylist.add("Pramod");

        System.out.println(mylist); // [Pramod, Anusha, Kiran, Pramod, Pramod]

        mylist.add("Dutta");
        System.out.println(mylist); // [Pramod, Anusha, Kiran, Pramod, Pramod, Dutta]
        mylist.set(1, "AnushaDutta");
        System.out.println(mylist); // [Pramod, AnushaDutta, Kiran, Pramod, Pramod, Dutta]

        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist); // [Pramod, AnushaDutta, Kiran, Pramod, Pramod, Dutta, 123, true]

        System.out.println("    - - - --  ");

        // how to print all the element one by one?
        for (int i = 0; i < mylist.size(); i++)
        {
            System.out.println(mylist.get(i));
        }

        System.out.println("    - - - - -  ");


        // Enhanced For loop
        for (Object o : mylist) {
            System.out.println(o);
        }

    }
}
