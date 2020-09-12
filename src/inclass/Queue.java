package inclass;

/** A first-in, first-out queue. */
public interface Queue<K> {

    /** Removes and returns the key at the front of this queue. */
    public K dequeue();

    /** Adds key to the back of this queue. */
    public void enqueue(K key);

    /** Returns true if this queue is empty. */
    public boolean isEmpty();

}
