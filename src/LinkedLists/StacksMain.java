package LinkedLists;

import java.util.Stack;

public class StacksMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //pushes the items into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        //search for item in stack, not used often
        var search = stack.search(30);
        System.out.println(search);

        //removes the top stack
        var top = stack.pop();
        System.out.println(top);
        System.out.println(stack);
        top = stack.peek();
        System.out.println(top);

        //reverse the string
        String string = "abcd";
        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(string);
        System.out.println("\n"+result);

    }
}
