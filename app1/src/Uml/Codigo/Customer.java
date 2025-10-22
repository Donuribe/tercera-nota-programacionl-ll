package Uml.Codigo;



import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<OrderShop> orders;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(OrderShop order) {
        orders.add(order);
        System.out.println("Order placed by " + name + " on " + order.getDate());
    }

    public String getInfo() {
        return "Customer: " + name + " (" + email + ") - Total Orders: " + orders.size();
    }

    public String getName() {
        return name;
    }
}