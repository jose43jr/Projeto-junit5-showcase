package br.com.example.order;

import java.util.UUID;

public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Order place(String item, int quantity) {
        if (item == null || item.isBlank()) {
            throw new IllegalArgumentException("Item inválido");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }
        String id = UUID.randomUUID().toString();
        Order order = new Order(id, item.trim(), quantity);
        repository.save(order);
        return order;
    }

    public OrderRepository getRepository() {
        return repository;
    }
}
