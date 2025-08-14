package br.com.example.order;

public interface OrderRepository {
    Order save(Order order);
    Order findById(String id);
    int count();
}
