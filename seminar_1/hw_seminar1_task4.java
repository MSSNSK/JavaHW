/*
Реализовать простой калькулятор ("введите первое число"... "Введите второе число"... "укажите операцию,
которую надо выполнить с этими числами"... "ответ: ...")
 */


import java.util.Scanner;

public class hw_seminar1_task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = input.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = input.nextInt();
        System.out.print("Введите оператор необходимого действия (*, /, +, -) : ");
        String operator = input.next();
        switch (operator) {
            case "+" -> System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
            case "-" -> System.out.printf("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
            case "*" -> System.out.printf("%d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
            case "/" -> System.out.printf("%d / %d = %d", firstNumber, secondNumber, firstNumber / secondNumber);
            default -> System.out.print("Ошибка!");
        }
    }
}

