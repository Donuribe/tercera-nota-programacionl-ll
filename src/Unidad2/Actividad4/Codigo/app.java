package Unidad2.Actividad4.Codigo;

public class app {
    public static void main(String[] args) {
        System.out.println("=== ONLINE SHOP SYSTEM ===\n");

    
        Category electronics = new Category("Electronics", "Electronic devices and gadgets");
        Category clothing = new Category("Clothing", "Fashion and apparel");

        
        product laptop = new product("Laptop Dell", 899.99);
        product phone = new product("iPhone 15", 999.99);
        product shirt = new product("T-Shirt", 29.99);
        product jeans = new product("Jeans", 59.99);

        
        electronics.addProduct(laptop);
        electronics.addProduct(phone);
        clothing.addProduct(shirt);
        clothing.addProduct(jeans);

        System.out.println("\n" + electronics.getInfo());
        System.out.println(clothing.getInfo());

        
        Customer customer1 = new Customer("Juan Pérez", "juan@email.com");
        System.out.println("\n" + customer1.getInfo());

        
        OrderShop order1 = new OrderShop("2024-10-21");
        order1.addProduct(laptop);
        order1.addProduct(shirt);

        
        System.out.println();
        customer1.placeOrder(order1);

    
        System.out.println("\n=== ORDER DETAILS ===");
        System.out.println(order1.getInfo());


        OrderShop order2 = new OrderShop("2024-10-22");
        order2.addProduct(phone);
        order2.addProduct(jeans);
        
        System.out.println();
        customer1.placeOrder(order2);

        System.out.println("\n=== CUSTOMER INFO ===");
        System.out.println(customer1.getInfo());
    }
}