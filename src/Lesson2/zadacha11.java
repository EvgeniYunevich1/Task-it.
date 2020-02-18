package Lesson2;

//Определить является ли число простым
public class zadacha11 {
    public static void main(String[] args) {
        int num = 211;
        if (num / 1 == num & num / num == 1 & num % 2 != 0 & num % 3 != 0 & num % 5 != 0 & num % 7 != 0 || num == 2
                || num == 7 || num == 3 || num == 5) {
            System.out.println("Простое число" + " " + num);
        } else {
            System.out.println("Составное число" + " " + num);
        }
    }
}
