package linkedList;

public class SinglyLinkedList {

    private Node<Integer> head;

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(4);
        singlyLinkedList.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        singlyLinkedList.insertAtStart(0);
        singlyLinkedList.printList();
        System.out.println("Length of linked list: " + singlyLinkedList.length());
        singlyLinkedList.insertAtLast(singlyLinkedList.head, 5);
        singlyLinkedList.insertAtLast(singlyLinkedList.head, 6);
        singlyLinkedList.insertAtPosition(7, 7);
        singlyLinkedList.printList();
        System.out.println("Length of linked list: " + singlyLinkedList.length());
        singlyLinkedList.deleteFirst();
        singlyLinkedList.deleteLast();
        singlyLinkedList.deleteAtPosition(5);
        singlyLinkedList.printList();
        System.out.println("6 present in list: " + singlyLinkedList.search(6));
        System.out.println("10 present in list: " + singlyLinkedList.search(10));
    }

    public void printList() {
        Node curernt = head;
        while (curernt != null) {
            System.out.print(curernt.data + "->");
            curernt = curernt.next;
        }
        System.out.println("null");
    }

    public int length() {
        Node current = head;
        int count = 1;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public void insertAtLast(Node head, Object data) {
        Node node = new Node(data);
        node.next = null;
        if (head == null) {
            head = node;
        } else {
//            Node temp = head;
            while (head.next != null) {
                head = head.next;
            }
            head.next = node;
        }
    }

    public void insertAtStart(Object data) {
        if (head == null) head = new Node(data);
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAtPosition(int position, Object data) {
        if (position > length())
            throw new RuntimeException("Position is greater than list size");
        Node node = new Node(data);
        if (position == 1 || position == 0) {
            node.next = head;
            head = node;
        } else {
            Node left = head;
            int index = 0;
            while (index < position - 1) {
                left = left.next;
                index++;
            }
            Node right = left.next;
            left.next = node;
            node.next = right;
        }
    }

    public void deleteFirst() {
        head = head.next;
    }

    public void deleteLast() {
        int position = 1;
        Node current = head;
        while (position < length() - 1) {
            current = current.next;
            position++;
        }
        current.next = null;
    }

    public void deleteAtPosition(int position) {
        if (position > length())
            throw new RuntimeException("Position is greater than list size");
        Node left = head;
        if (position == 0 || position == 1) {
            head = head.next;
        } else {
            int index = 1;
            while (index < position - 1) {
                left = left.next;
                index++;
            }
            Node right = left.next.next;
            left.next = right;
        }
    }

    public boolean search(Object data) {
        Node current = head;
        while (current != null) {
            if (data == current.data)
                return true;
            current = current.next;
        }
        return false;
    }

}
