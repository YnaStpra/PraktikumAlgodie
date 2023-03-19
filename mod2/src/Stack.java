package Modul2;

import java.util.NoSuchElementException;

public class Stack {
    private Node top;
    private Node bottom;

    public Node getTop() {
        return top;
    }

    public void push(Object value) {
        var newNode = new Node(value);
        if (isEmpty()) top = bottom = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
    }

    public Object pop() {
        if (isEmpty()) throw new NoSuchElementException();
        var popItem = top;
        if (top == bottom) top = bottom = null;
        else {
            var second = top.next;
            top.next = null;
            top = second;
        }
        return popItem.value;
    }

    public void printAll() {
        if (isEmpty()) throw new NoSuchElementException();
        Node current = top;
        while (true) {
            if (current != null) {
                if (current.next == null) System.out.println(current.value);
                else {
                    System.out.println(current.value);
                    System.out.println("^");
                }
                current = current.next;
            } else break;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }
}
