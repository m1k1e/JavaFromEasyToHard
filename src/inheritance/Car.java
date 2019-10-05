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
public class Car extends Auto {
    
    private int batteryCapacity;
    private int passangersNumber;

    public Car(String producer, String model, Engine engine, int batteryCapacity, int passangersNumber) {
        super(producer, model, engine);
        this.batteryCapacity = batteryCapacity;
        this.passangersNumber = passangersNumber;
    }
    
    
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setPassangersNumber(int passangersNumber) {
        this.passangersNumber = passangersNumber;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getPassangersNumber() {
        return passangersNumber;
    }
   
    public void charge(){
        System.out.println("Battery is charging!");
    }

}
