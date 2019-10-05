/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;


/**
 *
 * @author User
 */
public class Client {
    private int totalIncome;
    private int numbersFamilyPersons;
    
    public Client(int income, int persons){
        this.totalIncome = income;
        this.numbersFamilyPersons = persons;
    }
    
    public boolean grantLoan(float payment){
        boolean decision = false;
        int percentPayment;
        percentPayment = (int)(100 - payment * 100/ totalIncome);
 
        if(numbersFamilyPersons == 1 && percentPayment >  50 || numbersFamilyPersons == 2 && percentPayment > 45 || numbersFamilyPersons == 3 && percentPayment > 40 || 
                numbersFamilyPersons == 4 && percentPayment > 35 || numbersFamilyPersons >= 5 && percentPayment > 25){
            decision = true;
            //System.out.println("The bank decided to grant a loan!");
        }else{
            System.out.println("The bank decided not to issue a loan!");
        }
        
        
        return decision;
    }
    
}
