package Queues;

public class Array {
    public static void main(String[] args) {
        //ArrayQueue (ArrayDeque)
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.dequeue();
        var front = queue.dequeue();
        queue.enqueue(20);
        queue.enqueue(25);
        queue.enqueue(5);


        System.out.println(front);
        System.out.println(queue);
        //implement all standard queue operations
        //enqueue
        //dequeue
        //peek
        //isEmpty
        //isFull

    }
}
