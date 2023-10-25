package HashTables;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Key: employee number (integer)
        //Value: Name (String)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Helena");
        map.put(2, "Tim");
        map.put(3, "Johnny");
        //values with same key will overwrite the previous one
        map.put(3, "Nina");
        //hash maps allow null keys and null values
        map.put(null, null);
        map.remove(null);
        var value = map.get(3);
//        map.containsKey(3); //O(1)
//        map.containsValue("Nina"); //O(n)

        //iterable print out
        for(var item : map.entrySet())
            System.out.println(item);

        System.out.println(value);
        System.out.println(map);
    }
}
