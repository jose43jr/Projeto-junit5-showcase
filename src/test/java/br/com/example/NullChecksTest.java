package br.com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NullChecksTest {
    @Test void nullAndNotNull() {
        Object a = null, b = new Object();
        assertNull(a);
        assertNotNull(b);
    }
}
