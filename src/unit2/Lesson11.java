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
public class Lesson11 {
    public static void main(String[] args) {
        int factorialLimit = 10;
        int factorial = 1;
        
        for(int i = 1; i <= factorialLimit; i++){
            factorial *= i;
            System.out.println("Factorial = " + factorial);
        
        }
        
        System.out.println("FinalFactorial = " + factorial);
        
        for(int i = 10; i >= 0; i--){
            System.out.println("I = " + i);
        
        }
    }
    
}
