package Lesson3;

//сумма значений между максимальным и минимальным значениями.
public class zadacha15 {
    public static void main(String[] args) {
        int marks[] = {3, 17, 8, 9, 11, 10, 1};
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
        int minMarck = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < minMarck) {
                minMarck = marks[i];
                minMarksIndex = i;
            }
        }
        if (minMarksIndex < maxMarkIndex) {
            int sum = 0;
            for (int i = minMarksIndex + 1; i < maxMarkIndex; i++) {
                sum += marks[i];
            }
            System.out.println(sum);
        }
        if (maxMarkIndex < minMarksIndex) {
            int sum = 0;
            for (int i = maxMarkIndex + 1; i < minMarksIndex; i++) {
                sum += marks[i];
            }
            System.out.println(sum);
        }

    }
}
