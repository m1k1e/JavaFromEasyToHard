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
public class Truck extends FuelAuto {
    
    private int cargoWeight;

    public Truck(String producer, String model, Engine engine, int cargoWeight, int availablePetrol, int tankVolume) {
        super(availablePetrol, tankVolume, producer, model, engine);
        this.cargoWeight = cargoWeight;
    }

    
    

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
    
    public void loading (int weight){
        cargoWeight += weight;
        System.out.println("Cargo weight is " + cargoWeight);
    }
    
    public void unloading (int weight){
        cargoWeight -= weight;
        System.out.println("Cargo weight is " + cargoWeight);
    }
    
    

    
    
}
