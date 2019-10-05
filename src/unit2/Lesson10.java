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
public class Lesson10 {
    public static void main(String[] args) {
        double currentBalance = 0;
        double finalBalance = 100000;
        double payment = 1000;
        int years = 0;
        double inerestRate = 0.1;
        
        do {
            currentBalance += payment;
            currentBalance += (currentBalance*inerestRate);
            years++;
            System.out.println("Year " + years + " - " + currentBalance);
            } while(currentBalance < finalBalance && years < 15);
    }
}
