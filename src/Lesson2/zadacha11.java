package Lesson2;

//Определить является ли число простым
public class zadacha11 {
    public static void main(String[] args) {
        int num = 5;
        int delitel = 0;
        for (int i = 1; i <= num; i++) {
            if((num % i) == 0){
            delitel++;
            }
        }
        if (delitel == 2) {
            System.out.println("Простое число" + " " + num);
        } else {
            System.out.println("Составное число" + " " + num);
        }
    }
}
