package Lesson5;

import java.util.Scanner;

public class Zadacha20 {
    public static void main(String[] args) {
//Имеется строка с текстом.Вывести текст, составленный из последних букв всех слов.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = scanner.nextLine();   //  вводим строку
        String delitSpaceString = string.trim();   // убераем пробелы в начале и конце строки
        String delitSpaceStringSigns = delitSpaceString.replaceAll("[,:;!?.()]", "");//убираем знаки припинания
        char variable;
        for (int i = 0; i < delitSpaceStringSigns.length(); i++) {
            if (delitSpaceStringSigns.charAt(i) == ' ' && delitSpaceStringSigns.charAt(i - 1) != ' ') {
                variable = delitSpaceStringSigns.charAt(i - 1);
                System.out.print(variable);
            }

        }
        System.out.println(delitSpaceStringSigns.substring(delitSpaceStringSigns.length() - 1));

    }
}


