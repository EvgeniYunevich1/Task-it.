package Lesson5;

import java.util.Scanner;
//Найти в строке не только запятые,но и другие знаки препинания.Подсчитать общее их количество.
public class Zadacha18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = scanner.nextLine();
        int a = 0;
        String s = ",.!?;:-()";
        for (int i = 0; i < string.length(); i++) {
            for (int b = 0; b < s.length(); b++) {
                if (string.charAt(i) == s.charAt(b)) {
                    a++;
                }
            }

        }
        System.out.println("Количество знаков препинания в строке = " + a);
    }
}
