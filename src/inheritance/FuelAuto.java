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
public class FuelAuto extends Auto{
    private int availablePetrol;
    private int tankVolume;

    public FuelAuto(int availablePetrol, int tankVolume, String producer, String model, Engine engine) {
        super(producer, model, engine);
        this.availablePetrol = availablePetrol;
        this.tankVolume = tankVolume;
    }
    
    

    public void setAvailablePetrol(int availablePetrol) {
        this.availablePetrol = availablePetrol;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public int getAvailablePetrol() {
        return availablePetrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    
    
    public void fuelUp(int petrolVolume){
        availablePetrol += petrolVolume;
        System.out.println("Fuel up! Available petrol = " + availablePetrol);
                
    }
    
}
