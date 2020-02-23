package Lesson3;

public class zadacha16 {
    //Создать массив,заролнить его случайными элементами,распечатать ,перевернуть,и снова распечатать.
    public static void main(String[] args) {
        int mas[] = new int[6];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 2 + 1);
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
        }
        System.out.println();
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i]);
        }

    }
}
