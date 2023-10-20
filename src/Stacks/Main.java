package Stacks;

import java.util.Stack;

public class Main {
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

        //Balanced expressions
        //Iterate over the string, each character at a time
        //if it's an opening bracket, need to push it to the top of our stack
        //If its a regular character (1, space, +) we ignore it
        //when its a closing bracket, we need to pop the character on top of the stack and compare
        //it with the current character. If they match, we go forward until we reach the end of the string
        //if not, we immediatly stop and return false

        String str = "<1 + 2)";
        StringBalanced balanced = new StringBalanced();
        var resultB = balanced.balanced(str);
        System.out.println(resultB);

        //Stack

        Stack1 stack1 = new Stack1();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);

        System.out.println(stack1.peek());

        //pop
        var top1 = stack1.pop();
        System.out.println("\n" + top1);
        System.out.println(stack1);
        //peek
        //isEmpty
        System.out.println(stack1.isEmpty());
        //int[]



    }
}
