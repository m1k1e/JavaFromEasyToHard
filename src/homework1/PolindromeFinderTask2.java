/*
 * Напишите программу которая  проверяет введенное с клавиатуры число и говорит
 * является ли данное число палиндромом.
 * Палиндром - это число которое читается одинаково и спереди назад и сзади наперед.
 * Примеры 12321, 45654, 787 и т.д.
 *
 * Дополнительное условие: программа принимает только числа длинной 5 знаков.
 * В случае если было введено число длинной != 5, программа должна выполнить еще
 * одно прохождение цикла и попросить снова ввести значение с клавиатуры.
 * У данной задачи есть разные варианты решения.
 * 1) С помощью конвертации чисел в строки и обратно.
 * 2) Решение с помощью щю использования остатка от деления на 10.
 *
 * Вам нужно выполнить задания двумя способами.
 */
package homework1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PolindromeFinderTask2 {
    public static void main(String[] args) {
        //Создаем объект для ввода с консоли
        Scanner inputNumber = new Scanner(System.in);
        
        //Продлагаем вводить числа и сообщаем,  что для выхода из программы нужно ввести Q
        System.out.println("PLEASE, ENTER A POSITIVE INTEGER VALUE WITH 2 OR 5 DIGITS, 'Q' TO STOP(FOR EXAMPLE: 22)");
        
        while(inputNumber.hasNext()){
            try{
                 int number = inputNumber.nextInt();
                 int first = 0, second = 0, third = 0, fourth = 0, fifth = 0;
                 if(number > 9 &&  number < 99){
                     first = number / 10;
                     second = number%10;
                     if(first == second){
                         System.out.println(number + " is Polindrome!!!");
                         break;
                     }else
                     System.out.println(number + " is not Polindrome!!!");
                   }else if(number > 99 &&  number < 999){
                       first = number / 100;
                       third = number%10;
                       if(first == third){
                         System.out.println(number + " is Polindrome!!!");
                         break;
                     }else
                     System.out.println(number + " is not Polindrome!!!");
                    }else if(number > 999 &&  number < 9999){
                       first = number / 1000;
                       second = (number / 100)%10;
                       third = (number/10)%10;
                       fourth = number % 10;
                       if(first == fourth && second == third){
                         System.out.println(number + " is Polindrome!!!");
                         break;
                     }else
                     System.out.println(number + " is not Polindrome!!!");
                    }else if(number > 9999 &&  number < 99999){
                       first = number / 10000;
                       second = (number / 1000)%10;
                       fourth = (number/100)%10;
                       fifth = number % 10;
                       if(first == fifth && second == fourth){
                         System.out.println(number + " is Polindrome!!!");
                         break;
                     }else
                     System.out.println(number + " is not Polindrome!!!");
                    }else{
                      System.out.println("INCORRECT NUMBER");
                      break;
                    }
            }catch(InputMismatchException e) {
            //Если пользователь ввел значение другого типа проверяем его и или выхдим или сообщаем о некоректном вводе
            String next = inputNumber.next();
            if ("Q".equalsIgnoreCase(next)) {
                break;
            } else {
                System.out.println("INCORRECT NUMBER");
            }
        }
            
        }
        inputNumber.close();
        
    }
}
