package inclass;

public class ArrayQueue<K> implements Queue<K> {

    private K[] keys;

    private int front;

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
