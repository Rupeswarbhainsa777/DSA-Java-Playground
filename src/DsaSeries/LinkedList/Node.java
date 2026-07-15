package DsaSeries.LinkedList;

class Node {
    int val;
    Node prev;
    Node next;
    Node child;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node prev, Node next, Node child) {
        this.val = val;
        this.prev = prev;
        this.next = next;
        this.child = child;
    }
}