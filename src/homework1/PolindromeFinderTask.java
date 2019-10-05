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
public class PolindromeFinderTask {
    public static void main(String[] args) {
        //Создаем объект для ввода с консоли
        Scanner inputNumber = new Scanner(System.in);
        
        //Продлагаем вводить числа и сообщаем,  что для выхода из программы нужно ввести Q
        System.out.println("PLEASE, ENTER A POSITIVE INTEGER VALUE WITH 2 OR 5 DIGITS, 'Q' TO STOP(FOR EXAMPLE: 22)");
        
        while(inputNumber.hasNext()){
            try{
                 int number = inputNumber.nextInt();
                 String value = String.valueOf(number);
                 String first, second, third, fourth, fifth;
                 if(value.length() > 0 &&  value.length() < 6){
                   switch(value.length()){
                       case 2:
                           first = value.substring(0,1);
                           second = value.substring(1);
                           if(first.equals(second)){
                               System.out.println("Number is Polindrom!!!");
                               break;
                           }else{
                               System.out.println("Number is not Polindrom!!!");
                               break;
                           }
                       case 3:
                           first = value.substring(0,1);
                           third = value.substring(2);
                           if(first.equals(third)){
                               System.out.println("Number is Polindrom!!!");
                               break;
                           }else{
                               System.out.println("Number is not Polindrom!!!");
                               break;
                           }
                        case 4:
                           first = value.substring(0,1);
                           second = value.substring(1,2);
                           third = value.substring(2,3);
                           fourth = value.substring(3);
                           if(first.equals(fourth) && third.equals(second)){
                               System.out.println("Number is Polindrom!!!");
                               break;
                           }else{
                               System.out.println("Number is not Polindrom!!!");
                               break;
                           }
                        case 5:
                           first = value.substring(0,1);
                           second = value.substring(1,2);                           
                           fourth = value.substring(3,4);
                           fifth = value.substring(4);
                           if(first.equals(fifth) && fourth.equals(second)){
                               System.out.println("Number is Polindrom!!!");
                               break;
                           }else{
                               System.out.println("Number is not Polindrom!!!");
                               break;
                           }
                   
                    }
                }else{
                     System.out.println("INCORRECT NUMBER");
                 }
                 
            
            }catch (InputMismatchException e) {
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
