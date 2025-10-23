package Unidad2.Actividad1;

public class app {
    public static void main(String[] args) {
        System.out.println("=== CAR RENTAL SYSTEM ===\n");

       
        Rental rental = new Rental();

        // Agregar carros al sistema
        System.out.println("--- Adding cars to system ---");
        rental.addCar(new Car("Toyota Corolla", 50.0, true));
        rental.addCar(new Car("Honda Civic", 60.0, false));
        rental.addCar(new Car("Ford Mustang", 100.0, true));
        rental.addCar(new Car("BMW X5", 150.0, true));
        rental.addCar(new Car("Mazda 3", 45.0, false));

       
        rental.showAllCars();

       
        rental.showAvailableCars();

       
        System.out.println("\n=== Rental Simulation ===");
        Car selectedCar = rental.searchCar("Toyota Corolla");
        
        if (selectedCar != null) {
            int days = 5;
            double total = rental.calculateTotal(selectedCar, days);
            
            if (total > 0) {
                System.out.println("Renting: " + selectedCar.getModel());
                System.out.println("Days: " + days);
                System.out.println("Price per day: $" + selectedCar.getPriceDay());
                System.out.println("Total cost: $" + total);
                
                
                selectedCar.setAvailable(false);
                System.out.println("\n" + selectedCar.getModel() + " is now rented out.");
            }
        }

       
        rental.showAvailableCars();

        
        System.out.println("\n=== Trying to rent unavailable car ===");
        Car unavailableCar = rental.searchCar("Honda Civic");
        if (unavailableCar != null) {
            rental.calculateTotal(unavailableCar, 3);
        }

        
        System.out.println("\n=== Searching for non-existent car ===");
        rental.searchCar("Tesla Model 3");
    }
}
