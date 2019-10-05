/*
  * Напишите программу, которая принимает заранее неизвестное количество оценок
 * считает общую сумму оценок и среднее значение.
 * Оценки должны быть получены с консоли и от запуска к запуску их количество может меняться.
 * Для этого вам понадобится один из циклических операторов с заранее не известным количеством циклов.
 * Вспомните, какие бывают циклические операторы и в чем особенность каждого из них.
 * Так же вам понадобится определенное значение, которое будет обозначать завершение обработки
 * входящих данных и переход к вычислениям. Так как оценки не могут быть отрицательными,
 * можно использовать отрицательное целое значение (например -1 или -5) как указатель выхода из цикла.
 *
 * Для выполнения задания Вам понадобится класс Scanner.
 * Создайте объект класса <code> Scanner scanner = new Scanner(System.in);</code>
 * Используя методы этого класса, Вы можете прочитать с консоли данные разного типа.
 * <code>
 *     scanner.nextInt();
 *     scanner.nextDouble();
 *     scanner.nextLine();
 *     scanner.nextFloat();
 *     scanner.next();
 * </code>
 *
 * После выполнения задания сверьтесь с тем что написано в  GradeCalculatorSolution.java.
 *
 * Подумайте какие есть недостатки у решения в классе GradeCalculatorSolution.
 *
 * Вам нужно предложить 2 улучшения. По желанию можно реализовать их самостоятельно (не обязательно).
 * Подсказка: одно из них реализовать очень просто.
 * Для второго Вам могут понадобиться знания из раздела Обработка исключений в Java.

 */
package homework1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class GradeCalculatorTask {
    public static void main(String[] args) {
        //Создаем объект для консольного ввода
        Scanner input = new Scanner(System.in);
        
        //Продлагаем вводить числа и сообщаем,  что для выхода из программы нужно ввести Q
        System.out.println("PLEASE, ENTER A POSITIVE INT VALUE, 'Q' TO STOP");
        
        //Создаем объект типа List
        List<Integer> grades = new ArrayList<>();
        
        //Заходим в цикл и проверяем, что вводит пользователь
        while(input.hasNext()){
        try{
            int value = input.nextInt();
            
            //Если значение больше 0 и меньше 13 присваиваем его объекту grades
            if(value > 0 && value < 13){
                grades.add(value);
                System.out.println("RECEIVED NUMBER: " + value);
            }else{
                //Иначе сообшаем пользователю что он ввел некоректное число
                System.out.println("INCORRECT NUMBER");
            }
        }catch (InputMismatchException e) {
            //Если пользователь ввел значение другого типа проверяем его и или выхдим или сообщаем о некоректном вводе
            String next = input.next();
            if ("Q".equalsIgnoreCase(next)) {
                break;
            } else {
                System.out.println("INCORRECT NUMBER");
            }
        }
    }
        //Считаем сумму и среднее значение
    System.out.println("SUM IS: " + grades.stream().mapToInt(i -> i).sum() + " AVERAGE IS: " + grades.stream().mapToInt(i -> i).average());
    input.close(); 
    }
}
