package Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        var front = queue.remove();
        System.out.println(front);
        System.out.println(queue);

        reverse(queue);
        System.out.println(queue);


    }
    public static void reverse(Queue<Integer> queue){
        //use a stack to move each element over to it and then move back
        // in a reversed order
        // Q = [10, 20, 30]
        // S = [10, 20, 30] have to take last number (head) out first
        // New Q = [30, 20, 10]
        Stack<Integer> stack = new Stack<>();

        while(!queue.isEmpty())
            stack.push(queue.remove());
        while(!stack.isEmpty())
            queue.add(stack.pop());

    }
}
