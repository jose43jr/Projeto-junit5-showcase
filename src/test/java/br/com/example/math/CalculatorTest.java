package br.com.example.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator - testes básicos de operações")
class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test @DisplayName("Deve somar dois números")
    void shouldAddNumbers() { assertEquals(7, calc.add(3, 4)); }

    @Test void shouldSubtract() { assertEquals(1, calc.subtract(5, 4)); }

    @Test void shouldThrowWhenDividingByZero() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
        assertEquals("Divisão por zero", ex.getMessage());
    }
}
