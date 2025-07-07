package August.ex_18082024.CollectionFramework;

// List Concept

import java.util.ArrayList;

public class Lab209 {
    public static void main(String[] args) {
        // Collection Framework
        // Collection - Interface
        // Collection(I) -> List (I)
        // List (I) has implementation by the 3 classes -> ArrayList, LinkedList, Stack, Vector

        // List is Shopping List, Marks List, Collection of items, Todo List, Student List.
        // How to create List
        // Collection mylist3 = new ArrayList(); //  Dynamic Dispatch
        // List mylist = new ArrayList(); //  Dynamic Dispatch

        ArrayList mylist2 = new ArrayList(); // data will be store in a continuous memory like array
        mylist2.add("Pramod");
        mylist2.add("Amit");
        mylist2.add("lucky");
        mylist2.add("Muthu");
        System.out.println(mylist2); // [Pramod, Amit, lucky, Muthu]
        System.out.println(mylist2.size()); // 4
        System.out.println(mylist2.contains("Amit")); // true
        System.out.println(mylist2.contains("Hemalata")); // false
        String s1 = (String) mylist2.get(1);
        System.out.println(s1);
        mylist2.add(123); // We can store heterogeneous data in ArrayList
        mylist2.add(true);
    }
}
