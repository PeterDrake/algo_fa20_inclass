package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    Stack<Integer> s = new ArrayStack<>();

    @Test
    void isInitiallyEmpty() {
        assertTrue(s.isEmpty());
    }

    @Test
    void isNotEmptyAfterPush() {
        s.push(1);
        assertFalse(s.isEmpty());
    }

    @Test
    void maintainsOrder() {
        s.push(1);
        s.push(2);
        assertEquals(2, s.pop());
        assertEquals(1, s.pop());
    }

    @Test
    void becomesEmptyAtCorrectTime() {
        s.push(1);
        s.push(2);
        s.pop();
        assertFalse(s.isEmpty());
        s.pop();
        assertTrue(s.isEmpty());
    }

}