package br.com.example.order;

import java.util.Objects;

public class Order {
    private final String id;
    private final String item;
    private final int quantity;

    public Order(String id, String item, int quantity) {
        this.id = id; this.item = item; this.quantity = quantity;
    }
    public String getId() { return id; }
    public String getItem() { return item; }
    public int getQuantity() { return quantity; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order other = (Order) o;
        return quantity == other.quantity &&
               Objects.equals(id, other.id) &&
               Objects.equals(item, other.item);
    }
    @Override public int hashCode() { return Objects.hash(id, item, quantity); }
}
