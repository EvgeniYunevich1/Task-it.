package Lesson3;

public class zadacha17 {
    // Создать двухмерный квадратный массив,и заполнить его "бабочкой",т.е таким образом.
    public static void main(String[] args) {
        int m[][] =new int[10][10];
        for(int i=0;i<m.length/2;i++){
            for(int j=0;j<m[i].length;j++){
                if(((j<i)) || (j>=(m[i].length-i)))
                    m[i][j]=0;
                else
                    m[i][j]=1;
                System.out.print(m[i].length);
            }
        }
        for(int i=m.length-1;i>=m.length/2;i--){
            for(int j=0;j<m[i].length;j++){
                if((j<(m[i].length-1-i) || (j>i)))
                    m[i][j]=0;
                else
                    m[i][j]=1;
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

}
