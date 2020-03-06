package Task23;

import java.util.Scanner;

public class Interface {
    public static void Interface() {

        Bankomat bankomat = new Bankomat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1-снять деньги 2- проверить баланс 3- выход");
        int Opereshen = 0;
        while (Opereshen < 3) {
            Opereshen = scanner.nextInt();
            switch (Opereshen) {
                case 1:
                    System.out.println("Введите сумму");
                    int sum = scanner.nextInt();
                    bankomat.calculeitCash(sum);
                    System.out.println("Введите число 1-снять деньги   2- проверить баланс 3- выход");
                    continue;
                case 2:
                    System.out.println("Денег в банкомате " + bankomat.x);
                    System.out.println("Введите число 1-снять деньги 2- проверить баланс 3- выход");
                    break;
                default:
                    Opereshen = 0;
                    System.out.println("Такой операции не существует");
                    System.out.println("Введите число 1-снять деньги   2- проверить балан 3- выход");
                    break;
                case 3:
                    System.out.println("До свидания");
                    break;
            }
        }
    }
}



