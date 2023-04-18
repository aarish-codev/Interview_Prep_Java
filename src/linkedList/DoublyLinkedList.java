package linkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private Node<Integer> head;
    private Node<Integer> tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtLast(2);
        dll.insertAtLast(3);
        dll.insertAtLast(4);
        dll.printForward();
        System.out.println("Length: " + dll.length);
        dll.printBackward();
        dll.insertAtStart(1);
        dll.printForward();
        dll.deleteFirst();
        dll.deleteFirst();
        dll.deleteFirst();
//        dll.deleteFirst();
        System.out.println("Length: " + dll.length);
        dll.printForward();
        dll.deleteLast();
        dll.printForward();
    }

    public int getLength() {
        return length;
    }

    public boolean isEmppty() {
        return length == 0;
    }

    public void insertAtLast(Object data) {
        Node node = new Node(data);
        if (isEmppty())
            head = node;
        else
            tail.next = node;
        node.previous = tail;
        tail = node;
        length++;
    }

    public void printForward() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void printBackward() {
        if (tail == null) {
            System.out.println("List is Empty");
            return;
        }
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.previous;
        }
        System.out.print("null");
        System.out.println();
    }

    public void insertAtStart(Object data) {
        Node node = new Node(data);
        if (isEmppty())
            tail = node;
        else
            head.previous = node;
        node.next = head;
        head = node;
        length++;
    }

    public Node deleteFirst() {
        if (isEmppty())
            throw new NoSuchElementException("List is empty");
        Node temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
            length--;
        }
        head = head.next;
        temp.next = null;
        return temp;
    }

    public Node deleteLast() {
        if (isEmppty())
            throw new NoSuchElementException("List is empty");
        Node temp = tail;
        if (head == tail) {
            head = null;
            length = 0;
        } else {
            tail.previous.next = null;
            length--;
        }
        tail = tail.previous;
        temp.previous = null;
        return temp;
    }


}
