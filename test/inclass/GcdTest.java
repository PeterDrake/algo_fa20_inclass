package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GcdTest {

    @Test
    void worksForSmallNumbers() {
        assertEquals(6, Gcd.gcd(12, 30));
    }

    @Test
    void worksForLargeNumbers() {
        assertEquals(3607, Gcd.gcd(130140560, 123456789));
    }

}