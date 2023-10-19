package Stacks;

public class Exercises {
    public int array[] = new int[5];

    private int count;

    public void push1(int item){
        if(count == array.length)
            throw new StackOverflowError();
        array[count++] = item;
    }

    public void push2(int item){
        if(count == array.length)
            throw new StackOverflowError();
        array[count++] = item;
    }

}
