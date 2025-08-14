package br.com.example.order;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class InMemoryOrderRepository implements OrderRepository {
    private final Map<String, Order> db = new ConcurrentHashMap<>();
    @Override public Order save(Order order) { db.put(order.getId(), order); return order; }
    @Override public Order findById(String id) { return db.get(id); }
    @Override public int count() { return db.size(); }
    public void clear() { db.clear(); }
}
