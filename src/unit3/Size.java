/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3;

/**
 *
 * @author User
 */
public enum Size {

    EXTRA_SMALL("XS"), SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL"), UNDERFIND(" ");

    Size(String abbreviation){
        this.abbreviation = abbreviation;
    }
    
    private String abbreviation;
    
    public String getAbbriviation(){
        return abbreviation;
    }
    
}
