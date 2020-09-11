package inclass;

public class LinkedQueue<K> implements Queue<K> {

    private class Node {

        K key;

        Node next;

        Node(K key, Node next) {
            this.key = key;
            this.next = next;
        }

    }

    private Node front;

    private Node back;

    @Override
    public K dequeue() {
        K result = front.key;
        front = front.next;
        return result;
    }

    @Override
    public void enqueue(K key) {
        Node n = new Node(key, null);
        if (front == null) {
            front = n;
            back = n;
        } else {
            back.next = n;
        }
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }
}
