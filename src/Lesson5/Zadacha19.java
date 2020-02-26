package Lesson5;

import java.util.Scanner;
//Имеется строка с текстом.Подсчитать количество слов в тексте.
public class Zadacha19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = scanner.nextLine();
        int n = 1;
        string = string.trim();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ' && string.charAt(i + 1) != ' ') {
                n++;
            }
        }
        System.out.println(n);

    }
}

