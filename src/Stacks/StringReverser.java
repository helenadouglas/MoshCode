package Stacks;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
        if(input == null)
            throw new IllegalArgumentException("Input cannot be null");


        Stack<Character> stack = new Stack<>();

        //could use this, but the other for-loop is better
//        for(int i = 0; i < input.length(); ++i){
//            stack.push(input.charAt(i));
//        }

        for(char ch : input.toCharArray())
            stack.push(ch);
        StringBuffer reversed = new StringBuffer();
        while (!stack.empty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}
