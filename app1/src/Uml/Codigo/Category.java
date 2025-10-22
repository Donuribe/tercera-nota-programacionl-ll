package Uml.Codigo;
import java.util.ArrayList;
import java.util.List;


public class Category {
    private String Name ;
    private String Description;
    private List<product> products;

    public Category(String Name, String Description) {
        this.Name = Name;
        this.Description = Description;
        this.products = new ArrayList<>();
    }

    public void addProduct(product product){
        products.add(product);
        System.out.println("producto"+product.getName()+"agregado a la categoria"+Name);
    }
 public String getInfo() {
        return "Category: " + Name + " - " +Description + " (Products: " + products.size() + ")";
    }

    public List<product> getProducts() {
        return products;
    }
}
