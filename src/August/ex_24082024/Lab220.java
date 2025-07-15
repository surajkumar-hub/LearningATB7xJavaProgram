package August.ex_24082024;

import java.util.ArrayList;
import java.util.Collections;

public class Lab220 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        marks.add(14);
        marks.add(98);
        marks.add(10);
        marks.add(99);
        Collections.sort(marks); // JVM knows Natural Sorting
        System.out.println(marks);

        ArrayList names = new ArrayList();
        names.add("Pramod");
        names.add("Amit");
        names.add("Dutta");
        names.add("Lukcy");
        Collections.sort(names); // Here JVM knows how to sort - A,D,L,P. Based on first alphabet (natural sorting)
        System.out.println(names);




    }
}
