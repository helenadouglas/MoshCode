package HashTables;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        //Maps: key -> value
        //Sets: only keys
        //Sets don't allow duplicate keys
        Set<Integer> set = new HashSet<>();
        int[] numbers = {1, 2, 3, 3, 2, 1, 4,};
        for(var number : numbers)
            set.add(number);
        System.out.println(set);

    }
}
