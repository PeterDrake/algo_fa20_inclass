package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueTest {

    Queue<Integer> q = new ArrayQueue<>();

    @Test
    void isInitiallyEmpty() {
        assertTrue(q.isEmpty());
    }

    @Test
    void isNotEmptyAfterEnqueue() {
        q.enqueue(1);
        assertFalse(q.isEmpty());
    }

    @Test
    void maintainsOrder() {
        q.enqueue(1);
        q.enqueue(2);
        assertEquals(1, q.dequeue());
        assertEquals(2, q.dequeue());
    }

    @Test
    void becomesEmptyAtCorrectTime() {
        q.enqueue(1);
        q.enqueue(2);
        q.dequeue();
        assertFalse(q.isEmpty());
        q.dequeue();
        assertTrue(q.isEmpty());
    }

    @Test
    void holdsSeveralKeys() {
        for (int i = 0; i < 10; i++) {
            q.enqueue(i);
        }
        for (int i = 0; i < 10; i++) {
            assertEquals(i, q.dequeue());
        }
    }

}