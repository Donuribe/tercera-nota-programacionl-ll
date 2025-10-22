package Uml.Codigo;

import java.util.ArrayList;
import java.util.List;

public class OrderShop {
    private String date;
    private double total;
    private List<product> products;

    public OrderShop(String date) {
        this.date = date;
        this.total = 0;
        this.products = new ArrayList<>();
    }

    public void addProduct(product product) {
        products.add(product);
        total += product.getprice();
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Order Date: ").append(date).append("\n");
        info.append("Products:\n");
        for (product p : products) {
            info.append("  - ").append(p.getinfo()).append("\n");
        }
        info.append("Total: $").append(total);
        return info.toString();
    }

    public String getDate() {
        return date;
    }

    public double getTotal() {
        return total;
    }
}


