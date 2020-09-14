package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueTest {

    Queue<Integer> q = new LinkedQueue<>();

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
    void enqueuesMultipleKeys() {
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        assertEquals(1, q.dequeue());
        assertEquals(2, q.dequeue());
        assertEquals(3, q.dequeue());
    }

}