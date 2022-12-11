/*
Вычислить n! (произведение чисел от 1 до n)
 */


import java.util.Scanner;

public class hw_seminar1_task2 {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int num) {
        int total = 1;
        for (int i = 1; i <= num; i++) {
            total *= i;
        }
        return total;
    }
}