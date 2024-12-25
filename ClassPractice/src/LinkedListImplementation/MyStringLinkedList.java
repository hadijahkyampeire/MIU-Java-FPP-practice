package LinkedListImplementation;

public class MyStringLinkedList {
    Node head;

    public MyStringLinkedList() {
        head = new Node(null);
    }

    class Node {
        String data;
        Node next;
        Node prev;

        public Node(String data) {
            this.data = data;
        }

        public String toString() {
            return data == null ? "null" : data;
        }
    }

    //adds to the front of the list
    public void addFirst(String item){
        if (item == null) { throw new NullPointerException("item is null"); }
        Node newNode = new Node(item);
        // Establish a connection with the new node and the header and the next
        newNode.next = head.next;
        newNode.prev = head;

        // If there is another node after header, link it to the new node
        if (head.next != null) {
            head.next.prev = newNode;
        }
        head.next = newNode;
    }

    //adds to the end of the list
    public void addLast(String item) {
        if (item == null) { throw new NullPointerException("item is null"); }
        Node newNode = new Node(item);
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        newNode.prev = lastNode;
    }

    public void removeFirst() {
        if (head.next == null) { throw new NullPointerException("head is null"); }
        Node firstNode = head.next;
        // if there is a node a head
        if (firstNode.next != null) {
            head.next = firstNode.next;
            firstNode.next.prev = head;
        } else {
            head.next = null;
        }
    }

    //removes node in last position
    public void removeLast() {
        if (head.next == null) { throw new NullPointerException("head is null"); }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.prev.next = null;
        lastNode = null;
    }

    public boolean remove(String item) {
        if (item == null) { throw new NullPointerException("item is null"); }
        if (head.next == null) { throw new NullPointerException("head is null"); }
        Node currentNode = head.next;
        while (currentNode != null) {
            if (currentNode.data.equals(item)) {
                if (currentNode.next != null) {
                    currentNode.prev.next = currentNode.next;
                    currentNode.next.prev = currentNode.prev;
                    return true;
                } else {
                    currentNode.prev.next = null;
                    return true;
                }
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    //determines whether the input string is in the list
    public boolean search(String s) {
        if (s == null) { throw new NullPointerException("s is null"); }
        Node currentNode = head.next;
        while (currentNode != null && !currentNode.data.equals(s)) {
            currentNode = currentNode.next;
        }
        if (currentNode == null) return false;

        return true;
    }

    public String toString() {
        if (head.next == null) { return ""; }
        StringBuilder s = new StringBuilder("[");
        Node currentNode = head.next;
        while (currentNode.next != null) {
            s.append(currentNode.data).append("-->");
            currentNode = currentNode.next;
        }
        s.append(currentNode.data).append("--> Null]");

        return s.toString();
    }


    public int size(){
        int count = 0;
        if (head.next == null) return 0;
        Node currentNode = head;
        while (currentNode.next != null) {
            ++count;
            currentNode = currentNode.next;
        }
        return count;
    }

    public static void main(String[] args){
        var list = new MyStringLinkedList();
        System.out.println(list);
        System.out.println("Size = " + list.size());
        list.addLast("Rich");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.addFirst("Bob");
        list.addFirst("Harry");
        list.addFirst("Steve");
        System.out.println(list);
        System.out.println("Size = " + list.size());
        list.removeLast();
        list.addLast("Omega");
        list.addLast("Test");
        System.out.println("After add 2 strings " + list);
        list.removeFirst();
        System.out.println(list);
        // search
        System.out.println(list.search("Harry"));
        System.out.println(list.search("Bob"));
        list.addLast("Tom");
        System.out.println("After adding tom: " + list);
        list.remove("Test");
        System.out.println("After removing Test: " + list);
    }
}
