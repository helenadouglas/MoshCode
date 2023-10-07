import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        java.util.LinkedList<String> x = new java.util.LinkedList<>();
        x.removeFirst();
        var list = new LinkedList<>();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
        list.removeFirst();
        System.out.println(list.contains(10));
    }
}