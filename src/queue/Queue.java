package queue;

import linkedList.Node;

import java.util.NoSuchElementException;

public class Queue {

    Node<Integer> front;
    Node<Integer> rear;
    private int length;

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.display();
        System.out.println("Length: " + queue.length);
        queue.dequeue();
        queue.enqueue(5);
        queue.display();
        System.out.println("Length: " + queue.length);
    }

    public void enqueue(Object data) {
        Node node = new Node(data);
        if (rear == null)
            front = node;
        else
            rear.next = node;
        rear = node;
        length++;
    }

    public Object dequeue() {
        if (front == null)
            throw new NoSuchElementException("Queue is empty");
        else {
            Object data = front.data;
            front = front.next;
            if (front == null)
                rear = null;
            length--;
            return data;
        }
    }

    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
