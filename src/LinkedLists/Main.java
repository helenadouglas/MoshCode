package LinkedLists;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        //list.removeFirst();
        //list.removeLast();
        //list.reverse();
        //var array = list.toArray();
        //System.out.println(Arrays.toString(array));
        System.out.println(list.getKthFromEnd(0));



    }
}