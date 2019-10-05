/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author User
 */

public class MainAppClass {
    /*private float loanAmount;
    private int years;
    private float interestRate;
    private int totalIncome;
    private int numberFamilyPersons;
    
    public MainAppClass(){
        this.loanAmount = 10000;
        this.years = 1;
        this.interestRate = 5;
        this.totalIncome = 1000;
        this.numberFamilyPersons = 1;
    }*/
    
    public static void main(String [] args){
       // MainAppClass calcuStart = new MainAppClass();
        float loanAmount;
        float interestRate;
        float extraPayment;
        int years;
        int totalIncome;
        int numberFamilyPersons;
        
        Scanner userIn = new Scanner(System.in);
        
        System.out.print("Do you want to take a loan(please type: yes or no)? > ");
        
        while(userIn.hasNext()){
            
        try{
            String answer = userIn.nextLine();
            
            if(answer.equalsIgnoreCase("yes")){
                
                System.out.println("How much loan do you want to take (please type integer number from 1 000 to 1 000 000 )? > ");
                loanAmount = userIn.nextFloat();
                
                if(1000 <= loanAmount && loanAmount< 10000){
                    interestRate = 3;
                    System.out.println("Interest rate equals " + interestRate);
                }else if(10000 <= loanAmount && loanAmount< 100000){
                    interestRate = 6;
                    System.out.println("Interest rate equals " + interestRate);
                }else if (100000 <= loanAmount && loanAmount< 1000000){
                    interestRate = 10;
                    System.out.println("Interest rate equals " + interestRate);
                }else{
                    System.out.println("Think more ...");
                    break;
                    }
                
                System.out.println("For what period do you want to take a loan (please type period from 1 year to 30 years)? > ");
                years = userIn.nextInt();
                
                System.out.println("You will make extra payments (please type integer number from 1 to 1000)? > ");
                extraPayment = userIn.nextInt();
                
                LoanCalculator calc = new LoanCalculator(loanAmount, years, interestRate, extraPayment);
                
                System.out.println("How many people are in your family (please type integer number from 1 to 10)? > ");
                numberFamilyPersons = userIn.nextInt();
                
                System.out.println("What is your family’s total income in month (please type integer number from 100 to 100000) ?");
                totalIncome = userIn.nextInt();
                
                Client user = new Client(totalIncome, numberFamilyPersons);
                if(user.grantLoan(calc.calculationPayment(loanAmount))){
                    calc.printTable();
                    break;
                }else {
                    System.out.println("Oups! The bank refused to grant you a loan.");
                    break;
                        }
            }else if ("Q".equalsIgnoreCase(answer) || "NO".equalsIgnoreCase(answer)) {
                break;
                } else {
                    System.out.println("INCORRECT INPUT");
                        }
        
        }catch(InputMismatchException e){
            
            e.printStackTrace();
            System.out.println("Something wrong!");
        }
        
        userIn.close();
    }
    
    }
}
