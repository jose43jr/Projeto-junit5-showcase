package br.com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Exemplo de testes aninhados")
class NestedExampleTest {
    @Nested @DisplayName("Cenário A")
    class ScenarioA { @Test void test1() { assertTrue(1 + 1 == 2); } }

    @Nested @DisplayName("Cenário B")
    class ScenarioB { @Test void test2() { assertThrows(NumberFormatException.class, () -> Integer.parseInt("x")); } }
}
