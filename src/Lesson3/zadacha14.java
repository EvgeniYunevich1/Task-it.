package Lesson3;
//В задаче на поиск максимальной оценки,вывести не саму оценку ,а ее номер.
public class zadacha14 {
    public static void main(String[] args) {
        int marks[]={1,10,3,4,6,50,22,3,};
        int maxIdex=0;
        for (int i=0;i<marks.length;i++){
            if(marks[maxIdex]<marks[i])
                maxIdex=i;
        }
        System.out.println(maxIdex);

    }
}