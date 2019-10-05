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
public class Auto {
    private String producer;
    private String model;
    private Engine engine;
    private int currentSpeed;
    protected boolean isRunning;
    
    public void start(){
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Auto is starting!");
    }

    
    public void stop(){
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Auto has stopped!");
    }

    public Auto(String producer, String model, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
        System.out.println("Auto is initialazing!");
    }
    
    public void accelerate(int kmPerHour){
        currentSpeed += kmPerHour;
        System.out.println("Current speed is accelerating = " + currentSpeed);
    }
    
    public String getProducer(){
        return producer;
    }
    
    public String getModel(){
        return model;
    }
    
    public Engine getEngine(){
        return engine;
    }
    
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    
    public boolean getRunning(){
        return isRunning;
    }

    @Override
    public String toString() {
        return "Auto{" + "producer=" + producer + ", model=" + model + ", engine=" + engine + ", currentSpeed=" + currentSpeed + ", isRunning=" + isRunning + '}';
    }
    
    
    
}
