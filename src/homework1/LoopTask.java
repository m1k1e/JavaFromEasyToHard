/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.Scanner;

/**
 *
 *  * Создайте программу, которая будет принимать две группы параметров:
 * - количество циклов выполнения программы;
 * - 3 числа a, b, n
 * и выводить на экран последовательность результатов вычисления следующего выражения
 * (a + 2^0*b),(a + 2^0*b + 2^1*b),(a + 2^0*b + 2^1*b + 2^2*b)..., (a+2^0*b + 2^1*b + 2^2*b +...+ 2^(n-1)*b)
 * где ^ обозначает возведение в степень, и эта операция выполняется до умножения.
 *
 * Пример:
 *  Please enter the number of iterations
 *   2
 *  Enter the group of 3 numbers
 *   0 2 10
 *  Output:
 *   2 6 14 30 62 126 254 510 1022 2046
 *  Enter the group of 3 numbers
 *   5 3 5
 *  Output:
 *  8 14 26 50 98
 *
 *  Пример:
 *  a=5, b=3, n=5
 *  (5+2^0*3)=8,(5+2^0*3 + 2^1*3)=14,(5+2^0*3 + 2^1*3 + 2^2*3)=26,(5+2^0*3 + 2^1*3 + 2^2*3 + 2^3*3)=50,
 *  (5+2^0*3 + 2^1*3 + 2^2*3 + 2^3*3 + 2^4*3)=98
 *
 *
 * 
 * @author User
 */
public class LoopTask {
    public static void main(String[] args) {
        //определяем перемменые
        int a = 0, b = 0, n = 0;
        //создаем поток ввода
        Scanner user_input = new Scanner(System.in);
        //Просим пользователя ввести количество повторов расчета
        System.out.println("Please enter the number of iterations");
        //записываем в переменную
        int iterations_number = user_input.nextInt();
        
        for(int i = 0; i < iterations_number; i++){
            //Просим пользователя ввести коеффициенты уравнения
            System.out.println("Enter the group of 3 numbers");
            //Запоминаем
            a = user_input.nextInt();
            b = user_input.nextInt();
            n = user_input.nextInt();
            int result = 0;
            result = a;
            //считаем и выводим на экран
            for(int j = 0; j < n; j++){
                result += (int)Math.pow(2, j) * b;
                System.out.print( result + " " );
            }
            
            System.out.println(" ");
        
        }
        
    }
    
}
