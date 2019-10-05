/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2;

/**
 *
 * @author User
 */
public class Lesson9 {
    public static void main(String[] args) {
        int i = 10;
        {
        int k = 15;
            System.out.println("i = " + i);
            System.out.println("k = " + k);
        }
        
        int testScore = 95;
        if(testScore >= 90){
            System.out.println("Excellent!");
        }else if(testScore >= 75)
        {
            System.out.println("Good!");
        }else 
            System.out.println("Bad!");
    }
    
}
