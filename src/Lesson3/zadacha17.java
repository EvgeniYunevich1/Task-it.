package Lesson3;

public class zadacha17 {
    // Создать двухмерный квадратный масив,и заполнить его "бабочкой",т.е таким образом
    public static void main(String[] args) {
        int m[][] = {{1, 1, 1, 1, 1},
                    {0, 1, 1, 1, 0},
                    {0, 0, 1, 0, 0},
                    {0, 1, 1, 1, 0},
                    {1, 1, 1, 1, 1}};
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

}
