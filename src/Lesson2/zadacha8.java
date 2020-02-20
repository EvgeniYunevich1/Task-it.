package Lesson2;

//рассчитать факториал числа
public class zadacha8 {
    public static void main(String[] args) {
        long zadannoeChislo = 3;
        long factorial = 1;
        long i = 1;
        while (i <= zadannoeChislo) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}

