/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n)
 */


import java.util.Scanner;

public class hw_seminar1_task1 {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(triangleNum(n));
    }

    public static int triangleNum(int num) {
        int total = 0;
        for (int i = 0; i <= num; i++) {
            total += i;
        }
        return total;
    }
}
