/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author User
 */
public class Task_026 {
    
    public static void main(String[] args) {
        Engine truckEngine = new Engine (10, EngineType.DISEL, 500);
        
        Truck truck1 = new Truck("VOLVO", "NVL 300", truckEngine, 300, 500, 1000);
        truck1.start();
        truck1.accelerate(50);
        truck1.stop();
        truck1.fuelUp(50);
        truck1.loading(500);
        truck1.unloading(350);
        System.out.println("\n");
        
       /* Car electricCar = new Car("TESLA", "Model S", 80, 4);
        electricCar.start();
        electricCar.stop();
        electricCar.charge();
        System.out.println("\n");
        
        
        Bus man1 = new Bus("MERCEDES", "MAN", EngineType.PETROL, 30, 80, 100);
        man1.fuelUp();
        man1.pickUpPassengers(5);
        man1.start();
        man1.release();*/
        
        
        
    }
    
}
