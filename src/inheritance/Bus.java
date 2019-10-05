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
public class Bus extends FuelAuto{
    
    private int passengersNumber;

    public Bus(int passengersNumber, int availablePetrol, int tankVolume, String producer, String model, Engine engine) {
        super(availablePetrol, tankVolume, producer, model, engine);
        this.passengersNumber = passengersNumber;
    }

        

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }
    
    public void pickUpPassengers (int numPassengers){
        this.passengersNumber += numPassengers;
        System.out.println("Picking up " + numPassengers + " passengers!");
    }
    
    public void release(){
        if(isRunning){
           stop(); 
        }
        this.passengersNumber = 0;
        System.out.println("Passengers released!");
    }
    
    public void fuelUp(){
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume;
        if(volume>getTankVolume()){
            setAvailablePetrol(getTankVolume());
        }
    }
            
}
