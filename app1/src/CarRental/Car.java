package CarRental;

public class Car {
    private String Model;
    private double PriceDay;
    private boolean available;

    public Car(String model, double PriceDay, boolean available) {
        this.Model = model;
        this.PriceDay = PriceDay;
        this.available = available; 
    }

    
    public String getModel() {
        return Model;
    }

   
    public double getPriceDay() {
        return PriceDay;
    }

   
    public boolean isAvailable() {
        return available; 
    }

   
    public void setAvailable(boolean available) {
        this.available = available; 
    }

  
    public String getInfo() {
        String Status = available ? "Available" : "Not Available"; 
        return "Model: " + Model + ", Price per Day: $" + PriceDay + ", Status: " + Status;
    }

}