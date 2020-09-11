package inclass;

public class LinkedStack<K> implements Stack<K> {

    private class Node {

        K key;

        Node next;

        Node(K key, Node next) {
            this.key = key;
            this.next = next;
        }

    }

    private Node top;

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public K pop() {
        K result = top.key;
        top = top.next;
        return result;
    }

    @Override
    public void push(K key) {
        top = new Node(key, top);
    }

}
