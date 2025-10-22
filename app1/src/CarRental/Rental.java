package CarRental;

import java.util.ArrayList;

public class Rental {
    
    private ArrayList<Car> carlist; 

    public Rental() {
        carlist = new ArrayList<>();
    }

    public void addCar(Car c) {
        carlist.add(c);
        
        System.out.println("Car " + c.getModel()); 
    }

     
    public void showAllCars() {
        System.out.println("\n=== All Cars ===");
        for (Car car : carlist) {
            
            System.out.println(car.getInfo()); 
        }
    }
     
     public void showAvailableCars() {
        System.out.println("\n=== Available Cars ===");
        boolean foundAvailable = false;
        
        
        for (Car car : carlist) { 
            
            if (car.isAvailable()) { 
                
                System.out.println(car.getInfo()); 
                foundAvailable = true;
            }
        }
        
        if (!foundAvailable) {
            System.out.println("No cars available at the moment.");
        }
    }
    
    
    public Car searchCar(String model) {
        for (Car car : carlist) {
            if (car.getModel().equalsIgnoreCase(model)) { 
                return car;
            }
        }
        System.out.println("Error: Car model '" + model + "' not found.");
        return null;
    }

    
    public double calculateTotal(Car car, int days) {
        if (car.isAvailable()) {
            return car.getPriceDay() * days;
        } else {
            System.out.println("Error: " + car.getModel() + " is currently not available for rent.");
            return 0.0;
        }
    }
}