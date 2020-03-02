package Lesson5;

import java.util.Scanner;

//Имеется строка с текстом.Подсчитать количество слов в тексте.
public class Zadacha19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = scanner.nextLine();
        int n = 0;
        string = string.trim();
        String stringDelitSings = string.replaceAll("[,:;!?.()]", "");
        if (stringDelitSings.length() != 0) {
            n++;
        }
        for (int i = 0; i < stringDelitSings.length(); i++) {
            if (stringDelitSings.charAt(i) == ' ' && stringDelitSings.charAt(i + 1) != ' ') {
                n++;
            }
        }
        System.out.println(n);


    }
}

