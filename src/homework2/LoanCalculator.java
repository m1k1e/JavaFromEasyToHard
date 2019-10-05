/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Задание.

В этом задании Вам предстоит разработать калькулятор ипотеки. Это (почти) 
реальное приложение которым пользуются ипотечные консультанты в банке. Пример 
такого калькулятора выполненного в Excel Вы можете найти по ссылке: 
docs.google.com

Используйте данный калькулятор для проверки правильности выполнения задания. 
Будьте внимательны, данный калькулятор не учитывает некоторые мелкие детали 
которые Вам придется учесть при выполнении задания. О них будет сказано чуть 
дальше. Для выполнения задания Вы можете использовать проект приложенный к 
данному разделу и в нем написать Ваш код. Там же Вы можете найти предложенный 
вариант решения задачи который можно использовать для проверки правильности 
собственного решения.Задание:

1. Создать класс калькулятор. Для нашего калькулятора нужно передавать 3 
обязательных параметра: loanAmount (объем кредита), years (количество лет на 
которое берется ипотека), interestRate (ежегодный процент под который банк 
выдает кредит); и один опциональный параметр – extraPayment (дополнительный 
ежемесячный платеж или же сумма, которую вносит плательщик сверх обязательной, 
например для ускоренного погашения). Рекомендуется использовать constructor 
overloading, для того чтобы передавать или не передавать extraPayment. Это не 
обязательно для работы программы (можно в качестве extraPayment передавать 0), 
но необходимо для лучшего усвоения материала. Будьте внимательны: так как на 
входе в калькулятор передается процент по кредиту из расчета на год, но клиент 
вносит платежи ежемесячно, соответственно каждый месяц он платит часть процента. 
Для решения этой маленькой задачи Вам понадобится константа 
(подумайте что в данном случае можно объявить как константу).

2. Для успешного выполнения задания Вам нужно будет рассчитать и вывести в 
несколько колонок следующие значения: "MONTH, STARING_BALANCE, PAYMENT, 
INTEREST, PRINCIPAL, ENDING_BALANCE, TOTAL_INTEREST". Где MONTH – номер 
платежного месяца (в случае если кредит оформлен на 10 лет то номера идут 
от 1 до 120), STARING_BALANCE – баланс на начало месяца (т.е сумма 
задолженности до того как мы внесли очередной платеж, в самом начале равна 
объему кредита), PAYMENT – размер платежа за период (месяц), INTEREST – какую 
сумму от платежа составляет процент который клиент платит банку в текущем месяце, 
PRINCIPAL – сумма которая уходит на погашение тела кредита, ENDING_BALANCE – 
сумма задолженности, которая остается на конец месяца, после того как был 
внесен очередной платеж (эту же сумму нужно вывести в качестве STARING_BALANCE 
в следующем цикле), TOTAL_INTEREST – сколько суммарно денег заплатил банку 
заемщик в качестве процентов за пользование кредитом на конец текущего периода. 
Для вывода в консоль отформатированного текста Вы можете использовать оператор
printf. Пример:
System.out.printf("%d, %15.2f, %12.2f, %8.2f, %8.2f, %15.2f, %15.2f%n", 
periodCount, monthStartBalance, payment, monthlyInterest, monthlyPrincipal, 
monthEndBalance, interestAmount);
%15.2f%n - тут %15 отвечает за отступ вправо при выводе переданного аргумента, 
.2 отвечает за количество десятичных знаков после запятой в случае использования 
типа с плавающей точкой, f - указывает что мы передаем значение типа с 
плавающей точкой, %n - знак переноса строки.

3. В первую очередь нужно рассчитать PAYMENT. Для этого нужно создать отдельный 
метод. PAYMENT рассчитывается по формуле:

P = Pv * R / (1 - (1 + R)^-n

P – размер платежа;
Pv – размер задолженности на начало текущего периода;
R – месячный процент по кредиту (не годичный, который мы передаем в конструктор);
n – количество периодов (месяцев).

4. INTEREST – Размер задолженности на начало периода(месяца) умножить на 
месячный процент по кредиту. Рассчитать в отдельном методе (не смотря на то 
что там всего одно действие, это нужно для того чтобы лучше усвоить работу 
с методами и понятие области видимости переменных).

5. PRINCIPAL – PAYMENT (платеж за текущий месяц рассчитанный в п.3) + 
extraMonthlyPayment (если такой имеется) - INTEREST ( вычесть процент 
рассчитанный в п.4)

6. ENDING_BALANCE – сумма задолженности на конец периода = STARING_BALANCE 
(сумма задолженности на начало периода) - PRINCIPAL.

7. TOTAL_INTEREST – общая сумма которую заплатил заемщик в качестве процентов за 
все предыдущие месяцы плюс платеж текущего месяца.

8. Все выше перечисленные значения нужно вывести в цикле для каждого периода 
(так же как в приведенной таблице Excel). Будьте внимательны: при выводе 
значений для каждого месяца нужно учитывать что у нас может быть extraPayment, 
что приведет к досрочному погашению кредита. В таком случае мы не должны делать 
вывод в тех случаях когда наша задолженность может стать отрицательной. Так же 
мы не можем учитывать extraPayment тогда, когда сумма задолженности меньше чем 
обязательный ежемесячный платеж + extraPayment. Это значит что мы производим 
вывод только до тех пор пока у нас есть задолженность. При этом считаем что в 
последний месяц в качестве платежа мы погашаем только тело кредита без процентов, 
так как остаток задолженности уже меньше ежемесячного платежа. Нужно учесть 
что если задолженность меньше платежа то заплатить остаток за последний месяц 
тоже прийдется (соответственно и вывести тоже). После чего выходим из цикла. 
Для преждевременного выхода из цикла используется оператор break. 


9. После того как Вы успешно выполнили предыдущую часть задания - необходимо 
расширить программу следующим образом: добавите две переменных отвечающие за 
общий семейный доход и за количество членов семьи. Нам нужно добавить логику 
согласно которой программа принимает решение давать или не давать кредит. 
Все зависит от количества членов семьи и соотношения ежемесячного платежа и 
дохода семьи. В случае 1 человека платеж по ипотеке не должен превышать 50% 
от дохода. Если в семье 2 человека – 45%, 3 – 35%, 4 человека – 30%, 5 – 25%. 
Если банк дает кредит (все условия соблюдены), то выводим соответствующее 
сообщение и потом выводим распечатку всех платежей. В противном случае 
выводится сообщение о том что кредит на таких условиях не возможен.

10. Опциональное задание. Вам необходимо основываясь на знаниях полученных 
после выполнения задания к предыдущему модулю используя ввод с консоли 
(System.in) попросить пользователя вашей программы ввести все входные данные.
Список входных параметров будет не сложно составить если Вы выполнили все 
предыдущие задания к данному модулю.




 */
package homework2;

/**
 *
 * @author User
 */
public class LoanCalculator {
    private float startingBalance;
    private float monthInterestRate;
    private float extraPayment = 0;
    private int periodPayment;
    private final static int MONTH = 12;
    private final static int ONE_HUNDRED_PERCENT = 100;
    
    public LoanCalculator(float loanAmount, int years, float interestRate){
        this.startingBalance = loanAmount;
        this.periodPayment = years * MONTH;
        this.monthInterestRate = (interestRate/ONE_HUNDRED_PERCENT)/MONTH;
        
        //System.out.println("Object first initialithing!!!");
        //System.out.println("MONTH, STARING_BALANCE, PAYMENT, INTEREST, PRINCIPAL, ENDING_BALANCE, TOTAL_INTEREST");
    }
    
    public LoanCalculator(float loanAmount, int years, float interestRate, float extraPayment){
        this.startingBalance = loanAmount;
        this.periodPayment = years * MONTH;
        this.monthInterestRate = (interestRate/ONE_HUNDRED_PERCENT)/MONTH;
        this.extraPayment = extraPayment;
        //System.out.println("Object second initialithing!!!");
        
    }
    
    public float calculationPayment(float startBalance){
        float PAYMENT;
        float START_BALANCE = startBalance;
        float KOEFFICIENT;
        float A;
        float B;
        
        B = (1 + monthInterestRate);
        A = (float)Math.pow(B, periodPayment);
        KOEFFICIENT = (monthInterestRate * A)/(A - 1);
        
        PAYMENT = (KOEFFICIENT * START_BALANCE) + extraPayment;
        
        return PAYMENT;
    }
    
    public float calculationInterest(float statrBalance){
        float Interest;
        
         Interest = statrBalance * monthInterestRate;
         
        return Interest;
    }
    
    public float calculationPrincipal(float payment, float interest){
        
        float PRINCIPAL = payment + extraPayment - interest;
       
        return PRINCIPAL;
    }
    
    public float calculationEndBalance(float startBalance, float principal){
        float END_BALANCE = startBalance - principal;
        
        return END_BALANCE;
    }
    
    public void printTable(){
        float startBalance = startingBalance;
        int month = 0;
        float principal = 0;
        float payment;
        float interest;
        float endBalance;
        float totalInterest = 0;
        
        System.out.println("MONTH, STARING_BALANCE, PAYMENT, INTEREST, PRINCIPAL, ENDING_BALANCE, TOTAL_INTEREST");
        
        do{
            month++;
            
            startBalance = startBalance - principal;
        
            payment = calculationPayment(startingBalance);
        
            interest = calculationInterest(startBalance);
        
            principal = calculationPrincipal(payment, interest);
        
            endBalance = calculationEndBalance(startBalance, principal);
            
            totalInterest += interest;
             
            
            System.out.printf("%d, %15.2f, %10.2f, %8.2f, %8.2f, %12.2f, %12.2f \n", 
            month, startBalance, payment, interest, principal, endBalance, totalInterest);
            
            if(principal > (interest + payment) && principal > endBalance){
                break;
            }
        
            
          
      }while(endBalance >= 0.1);
        
    }
            
}
