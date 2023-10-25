package HashTables.Exercises;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacters {
    public static void main(String[] args) {
        CharFinder finder = new CharFinder();
        var ch = finder.findFirstNonRepeatChar("a green apple");
        System.out.println(ch);
    }

}
