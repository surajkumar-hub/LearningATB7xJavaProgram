package August.ex_24082024;
// Map Concept

import java.util.HashMap;
import java.util.Map;

public class Lab225 {
    public static void main(String[] args) {
        // Map  - key and value pair
        // name:pramod, roll:31, phone:9876543210
        Map m1 = new HashMap(); // Here values will be store randomly because of HashMap
//        Map m1 = new LinkedHashMap(); // Here values will be stored orderly
//        Map m1 = new TreeMap(); // Here values will be stored Sorted because of Treemap
        m1.put("name", "pramod"); // Put() is same as add method
        m1.put("rollNo", 123);
        m1.put("phone", 98765432);
        System.out.println(m1);
    }

}