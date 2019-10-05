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
public class Lesson12 {
    public static void main(String[] args) {
        int choice = 2;
        switch(choice){
            case 1: 
                System.out.println("You choose one!");
                break;
            case 2:
                System.out.println("You choose two!");
                break;
            case 3:
                System.out.println("You choose tree!");
                break;
            case 4:
                System.out.println("You choose four!");
                break;
            default:
                System.out.println("Unsupported option!");
        
        }
        
        String dayOfTheWeek = "Saturday";
        switch(dayOfTheWeek.toLowerCase()){
            case "monday":
                System.out.println("This is the first workind day.");
                break;
            case "tuesday":
                System.out.println("This is the second workind day.");
                break;
            case "wednesday":
                System.out.println("This is the third workind day.");
                break;
            case "thursday":
                System.out.println("This is the fourth workind day.");
                break;
            case "friday":
                System.out.println("This is the fifth workind day.");
                break;
            case "saturday":case "sunday":
                System.out.println("Finally weekend!!!");
                break;
            default:
                System.out.println("Not a day of the week.");
        }
        System.out.println("The end!");
    }
}
