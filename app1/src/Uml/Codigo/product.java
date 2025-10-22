package Uml.Codigo;

public class product {
    private String Name ;
    private double Price;

    public product(String Name, double Price) {
        this.Name = Name;
        this.Price = Price;
    }

    public String getinfo(){
        return"nombre "+Name+"precio"+Price;
    }

    public String getName (){
        return Name;
    }
    public double getprice(){
        return Price;
    }
}
