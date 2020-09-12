package inclass;

/** Linked stack implementation. */
public class LinkedStack<K> implements Stack<K> {

    /** List node. */
    private class Node {

        K key;

        Node next;

        Node(K key, Node next) {
            this.key = key;
            this.next = next;
        }

    }

    /** The top node in this stack, or null if this stack is empty. */
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
