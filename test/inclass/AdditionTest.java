package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void addsSmallNumbers() {
        assertEquals(4, Addition.add(2, 2));
    }

    @Test
    void addsLargeNumbers() {
        assertEquals(997, Addition.add(1000, -3));
    }

}