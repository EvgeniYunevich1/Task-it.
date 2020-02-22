package Lesson3;
//сумма значений между максимальным и минимальным значениями
public class zadacha15 {
    public static void main(String[] args) {
        int marks[] = {3, 1, 8, 9, 11, 10, 17};
        int maxMark = marks[0];
        int maxMarkIndex = 0;
        for (int i = 0; i < marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                if (marks[maxMarkIndex] < marks[i])
                    maxMarkIndex = i;
            }
        }
        int minMarksIndex = 0;
        int min = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
                minMarksIndex = i;
            }
        }
        int sum = 0;
        for (int i = minMarksIndex + 1; i < maxMarkIndex; i++) {
            sum += marks[i];
        }
        System.out.println(sum);
    }
}
