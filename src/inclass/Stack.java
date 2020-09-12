package inclass;

/** A last-in, first-out stack. */
public interface Stack<K> {

    /** Returns true if this stack is empty. */
    public boolean isEmpty();

    /** Removes and returns the top key. Assumes this stack is not empty. */
    public K pop();

    /** Adds key to the top of this stack. */
    public void push(K key);

}
