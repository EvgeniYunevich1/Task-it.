package Lesson3;

//В задаче на поиск максимальной оценки,вывести не саму оценку ,а ее номер.
public class zadacha14 {
    public static void main(String[] args) {
        int marks[] = {1, 10, 3, 4, 6, 5, 22, 3,};
        int maxIdex = 0;
        int max = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
                maxIdex = i;
            }
        }
        System.out.println(maxIdex);

    }
}