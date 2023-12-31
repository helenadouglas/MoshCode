package HashTables.Exercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    public char findFirstNonRepeatChar(String string){
        //A Green Apple
        Map<Character, Integer> map = new HashMap<>();

        var chars = string.toCharArray();
        for(var ch : chars){
//            if(map.containsKey(ch)){
//                var count = map.get(ch);
//                map.put(ch, count);
//            } else map.put(ch, 1);
            
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for(var ch : chars)
            if (map.get(ch) == 1)
                return ch;


        return Character.MIN_VALUE;
    }

    public char findFirstRepeatedChar(String string){
        Set<Character> set = new HashSet<>();
        var chars = string.toCharArray();

        for(var ch : chars){
            if(set.contains(ch))
                return ch;
            set.add(ch);
        }
        return Character.MIN_VALUE;

    }

}
