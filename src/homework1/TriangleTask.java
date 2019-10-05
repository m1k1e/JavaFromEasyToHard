/*
  *  Напишите программу которая принимает 3 числовых значения и проверяет, могут ли они быть
 *  сторонами треугольника.
 *  Для ввода значений с консоли Вам понадобится класс Scanner.
 *  <code>Scanner scanner = new Scanner(System.in);</code>
 *  <code>scanner.nextInt();</code>

 */
package homework1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TriangleTask {
    public static void main(String[] args) {
        //Создаем объект для консольного ввода и переменные
        Scanner inputPoint = new Scanner(System.in);
        int pointA = 0, pointB = 0, pointC = 0;
        
        //Просим ввести пользователя точки
        System.out.println("Enter tree points: ");
        pointA = inputPoint.nextInt();
        pointB = inputPoint.nextInt();
        pointC = inputPoint.nextInt();
        
        //Проверяем могут ли точки быть стронами треугольника
        if(pointA >= pointB + pointC || pointB >= pointA + pointC || pointC >= pointA + pointB){
            System.out.println("Triangle is not existing!");
        }else{
            System.out.println("Triangle is existing!");
        }
    }
}
