package August.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab213 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        // To print in descending order
        // Collections.sort(marks, Comparator.reverseOrder());
        // System.out.println(marks);

    }
}
