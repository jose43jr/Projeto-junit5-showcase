package br.com.example.order;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderServiceLifecycleTest {

    private static InMemoryOrderRepository repository;
    private OrderService service;

    @BeforeAll static void beforeAll() { repository = new InMemoryOrderRepository(); }
    @AfterAll  static void afterAll()  { System.out.println("Total de pedidos: " + repository.count()); }

    @BeforeEach void setUp() { service = new OrderService(repository); }
    @AfterEach  void tearDown() { /* exemplo */ }

    @Test @org.junit.jupiter.api.Order(1) @DisplayName("Deve criar pedido válido")
    void shouldPlaceOrder() {
        Order o = service.place("Livro", 2);
        assertNotNull(o.getId());
        assertEquals("Livro", o.getItem());
        assertEquals(2, o.getQuantity());
    }

    @Test @org.junit.jupiter.api.Order(2)
    void shouldHaveNonNullRepository() { assertNotNull(service.getRepository()); }

    @Test @Disabled("Exemplo de teste desabilitado")
    void disabledExample() { fail("não deve rodar"); }

    @Test void shouldThrowOnInvalidQuantity() {
        assertThrows(IllegalArgumentException.class, () -> service.place("Copo", 0));
    }
}
