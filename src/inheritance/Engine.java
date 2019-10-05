/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Engine {
    private double volume;
    private EngineType engineType;
    private int power;
    private List<Piston> piston = new ArrayList();

    public Engine(double volume, EngineType engineType, int power) {
        this.volume = volume;
        this.engineType = engineType;
        this.power = power;
        for(int i = 1; i <= 5; i++){
            this.piston.add(new Piston(0.3, i));
        }
    }
    
    
}
