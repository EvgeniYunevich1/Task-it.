package Lesson2;
// Сумма цифр целого числа

import java.util.Scanner;

public class zadacha10 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите число");
        int chislo = userInput.nextInt();
        int sum = 0;
        while (chislo > 0) {
            sum += chislo % 10;
            chislo /= 10;
        }
        System.out.println("Сумма чисел =" + sum);
    }
}
