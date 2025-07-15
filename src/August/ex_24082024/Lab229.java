package August.ex_24082024;

// Generic Concept

import java.util.ArrayList;
import java.util.List;

public class Lab229 {
    public static void main(String[] args) {
        // Generic - < 2%, very rare concept, rarely used
        List<Object> mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add(123);
        mylist.add(true);
        // Here it is accepting all the types of value because it is generic - List<Object>
        // If we have mention like this -> List<String>, then it"ll accept only String value

    }
}
