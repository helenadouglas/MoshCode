package HashTables.Exercises;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        CharFinder finder = new CharFinder();
        var ch = finder.findFirstRepeatedChar("a green apple");
        System.out.println(ch + " is the first repeated character");
    }
}
