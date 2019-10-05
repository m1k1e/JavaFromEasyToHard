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
public class Lesson13 {
    public static void main(String[] args) {
       printMessage("Mikhail");
       //printMessage("Alex");
       //printMessage("Dmitry");
       int firstRectangle = calcRectangleSquare(5,7);
       System.out.println("First Rectangle Square = " + firstRectangle);
       
       int secondSqare = calcSquare(9);
       System.out.println("Second Square = " + secondSqare);
       
       int sumOfSquares = firstRectangle + secondSqare;
       System.out.println("Summa of Squares = " + sumOfSquares);
    }
    
    static void printMessage(String name){
         System.out.println("Hello, " + name + " !!!");
    
    }
    
    static int calcRectangleSquare(int x, int y){
        int square = x * y;
        return square;
    
    }
    
    static int calcSquare(int x){
        return x * x;
    }
    
}
