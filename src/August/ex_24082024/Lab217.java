package August.ex_24082024;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab217 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Node 1");
        l.add("Node 2");
        l.add("Node 3");
        System.out.println(l);


        ArrayList l2 = new ArrayList();
        l2.add("Node 1");
        l2.add("Node 2");
        l2.add("Node 3");
        System.out.println(l2);


    }
}

/** O/P:
 [Node 1, Node 2, Node 3]
 [Node 1, Node 2, Node 3]

 There is no difference between linkedlist and ArrayList when we see the output. But the only difference is
 how they are storing the data. ArrayList stores in a continuous memory and LinkedList stores in Node wise
 **/
