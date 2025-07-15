package August.ex_24082024;


import java.util.HashMap;
import java.util.Map;

public class Lab226 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap(); // Map<String,Integer> It means datatype of key & Value is String and Integer
        map.put("id",1);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null); // null as a value is allowed n number of times
        map.put("id5",null);
        map.put(null,100); // null as a key is allowed only one time
        map.put(null,101); // if we have 2 null value, then latest value will be picked up
//        map.put("id5","pramod"); Not Possible because here value is string which should be Integer
        System.out.println(map);
        System.out.println(map.size()); // size means total number of keys
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(34));
        System.out.println(map.containsValue(99));
        System.out.println(map.keySet()); // If we want all they keys in set format then we can use this function
        System.out.println(map.values());
        System.out.println(map.get("id3"));

        System.out.println(" --- ");

        // How to iterate over all the elements in the map
        for(Map.Entry<String,Integer> item: map.entrySet())
        {
            System.out.println(item.getKey() + " -> "+ item.getValue());
        }

    }
}
