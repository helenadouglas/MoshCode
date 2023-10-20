package Queues;

public class Priority {
    public static void main(String[] args) {
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        queue.add(3);
//        queue.add(5);
//        queue.add(1);
//        queue.add(2);
//        while(!queue.isEmpty())
//            System.out.println(queue.remove());


        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(3);
        queue.add(6);
        queue.add(1);
        queue.add(4);

        System.out.println(queue);

        while(!queue.isEmpty())
            System.out.println(queue.remove());
    }
}
