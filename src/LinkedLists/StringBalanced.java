package LinkedLists;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StringBalanced {

    private final List<Character> leftBrackets = Arrays.asList('(','<','[','{');
    private final List<Character> rightBrackets = Arrays.asList(')','>',']','}');

    public boolean balanced(String input){
        if(input == null)
            throw new IllegalArgumentException("Cannot be null");

        Stack<Character> stack = new Stack<>();

        //iterating over our character array
        for(char ch : input.toCharArray()){
            if(isLeftBracket(ch)) //push it into the stack if it's a left bracket
                stack.push(ch);
            if(isRightBracket(ch)) { //pop it into the stack if it's a right bracket
                if(stack.empty()) return false;

                var top = stack.pop();
                if (isMatching(top, ch))return false;
            }
        }
        return stack.empty();
    }

    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }

    private boolean isMatching(char left, char right){
        // easier way of doing the return statement
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);

        // not as good
//        return (right == ')' && left != '(') ||
//                (right == '>' && left != '<') ||
//                (right == ']' && left != '[') ||
//                (right == '}' && left != '{');
    }
}
