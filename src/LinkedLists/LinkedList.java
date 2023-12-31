package LinkedLists;

import java.util.NoSuchElementException;

public class LinkedList {
    private static class Node {
        private int value;
        private Node next;
        public Node (int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size;

    private boolean isEmpty(){
        return first == null;
    }
    //addFirst
    public void addFirst(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            node.next = node;
            first = node;
        }
        size++;
    }
    //addLast
    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
        size++;
    }

    //contains
    public boolean contains (int item){
        return indexOf(item) != -1;
    }

    //indexOf
    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    //deleteFirst
    public void removeFirst (){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        if(first == last)
            first = last = null;
        else{
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }
    //deleteLast
    public void removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last)
            first = last = null;
           else {
            var previous = getPrevious(last);
            last = previous; // shrink list
            last.next = null; //removes link
        }
        size--;
    }

    private Node getPrevious (Node node){
        var current = first;
        while (current != null){
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    //size()
    public int size(){ // runtime complexity = O(1)
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse(){
        if(isEmpty()) return;
        //set the two variables
        var previous = first;
        var current = first.next;

        //change the direction of the links
        while (current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        //set the last field
        last = first;
        last.next = null;
        //set the first field
        first = previous;
    }

    public int getKthFromEnd(int k){
        //could also use this to give error message
//        if(k > size){
//            throw new IllegalArgumentException();
//        }

        if(isEmpty())
            throw new IllegalArgumentException();

        var head = first;
        var tail = first;

        for(int i = 0; i < k-1; ++i){
            tail = tail.next;
            if(tail == null)
                throw new IllegalArgumentException();
        }

        while (tail != last){
            head = head.next;
            tail = tail.next;
        }
        return head.value;
    }


}
