package August.ex_24082024;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Lab228 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "one"); // Allowed
        // ht1.put("one", "one"); // Not allowed because key is null, it should be Integer
        ht1.put(null, "one"); // Not allowed because Hashtable doesn't allow null

       HashMap h1 = new HashMap();
       h1.put(null,"dasda"); // In HashMap ull as a key is allowed only one time

       Set<String> fruits = new HashSet();
       fruits.add("Apple");
       fruits.add("Orange");
       fruits.add("apple");
       fruits.add("Water Melon");
       // fruits.add(123); Not allowed because we are passing Integer it should be String
    }
}
