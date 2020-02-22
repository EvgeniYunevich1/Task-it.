package Lesson3;

public class zadacha16 {
    //Создать массив,заролнить его случайными элементами,распечатать ,перевернуть,и снова распечатать.
    public static void main(String[] args) {
        int mas[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for(int i=0;i<mas.length;i++){
            System.out.print(mas[i]);}

        System.out.println();
        for(int i=mas.length-1;i>=0;i--){
            System.out.print(mas[i]);
        }

    }
}
