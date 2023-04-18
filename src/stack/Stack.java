package stack;

import linkedList.Node;

import java.util.NoSuchElementException;

public class Stack {

    Node<Integer> top;
    int length;

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println("Peek: " + stack.peek());

    }

    public void push(Object data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
        length++;
    }

    public void display() {
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Length: " + length);
    }

    public Object pop() {
        Object result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public Object peek() {
        if (top == null)
            throw new NoSuchElementException("Stack is empty");
        return top.data;
    }
}
