package br.com.example.order;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OrderServiceMockitoTest {

    @Mock
    OrderRepository repo;

    @InjectMocks
    OrderService service;

    @Test
    void deveCriarPedidoESalvar() {
        when(repo.save(any(Order.class))).thenAnswer(inv -> inv.getArgument(0));

        Order o = service.place("Livro", 1);

        assertNotNull(o.getId());
        assertEquals("Livro", o.getItem());
        assertEquals(1, o.getQuantity());

        verify(repo, times(1)).save(any(Order.class));
    }

    @Test
    void naoDeveSalvarQuandoQuantidadeInvalida() {
        assertThrows(IllegalArgumentException.class, () -> service.place("Livro", 0));
        verify(repo, never()).save(any());
    }
}
