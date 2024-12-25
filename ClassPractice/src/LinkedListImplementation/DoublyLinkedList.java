package LinkedListImplementation;

public class DoublyLinkedList {
    private class Node {
        Integer data;
        Node prev;
        Node next;

        Node(Integer data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node head;
    private int size;

    DoublyLinkedList() {
        head = new Node(null);
    }


    // Method to add an element to the beginning of the list
    public void addFirst(int element) {
        Node newNode = new Node(element);
        newNode.next = head.next;
        newNode.prev = head;
        if (newNode.next != null) {
            head.next.prev = newNode;
        }
        head.next = newNode;
        size++;
    }

    // Method to add an element to the end of the list
    public void addLast(int element) {
        Node newNode = new Node(element);
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
        size++;
    }

    // Method to delete the first element of the list
    public void deleteFirst() {
        if (head == null) return;
        Node first = head.next;
        if(first.next != null) {
            head.next = first.next;
            first.next.prev = null;
        } else {
            head.next = null;
        }
        size--;
    }

    // Method to delete the last element of the list
    public void deleteLast() {
        if (head == null) return;
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.prev.next = null;
        last = null;
        size--;
    }

    // Method to find an element in the list
    public Node find(int element) {
        if (head == null) return null;
        Node current = head.next;
        Node elem = null;
        while(current != null) {
            if (current.data == element) {
                elem = current;
            }
            current = current.next;
        }
        return elem;
    }

    public void printList() {
        Node current = head.next;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        try {
            list.addFirst(10);
            list.addLast(20);
            list.addLast(30);
            list.printList();
            list.deleteFirst();
            System.out.println("find: " + list.find(20));
            list.printList();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

