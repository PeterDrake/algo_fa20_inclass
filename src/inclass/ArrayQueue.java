package inclass;

/** Array-based queue implementation. */
public class ArrayQueue<K> implements Queue<K> {

    /**
     * Array of keys. Only the first size elements are part of this queue.
     * The queue grows toward larger indices and wraps around as needed.
     */
    private K[] keys;

    /** Index, in keys, of the front key. */
    private int front;

    /** Number of keys currently in this queue. */
    private int size;

    public ArrayQueue() {
        keys = (K[])new Object[1];
    }

    @Override
    public K dequeue() {
        K result = keys[front];
        front = (front + 1) % keys.length;
        size--;
        return result;
    }

    @Override
    public void enqueue(K key) {
        expandIfNecessary();
        keys[(front + size) % keys.length] = key;
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /** If this queue is full, copies the keys into an array twice as large. */
    private void expandIfNecessary() {
        if (size == keys.length) {
            K[] stretched = (K[])new Object[size * 2];
            for (int i = 0; i < size; i++) {
                stretched[i] = keys[(front + i) % keys.length];
            }
            keys = stretched;
        }
    }

}
