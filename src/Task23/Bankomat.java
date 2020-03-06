package Task23;


import Task23.Stovage;

public class Bankomat {
    public int x;
    Stovage stovage = new Stovage();

    public Bankomat() {
        x = stovage.getCashBankomat();
    }

    public int calculeitCash(int sum) {
        if (sum <= x) {
            if (sum % 100 == 0 || sum % 50 == 0 || sum % 20 == 0) {
                System.out.println("Выдано денег = " + sum);
            } else {
                System.out.println("Введите другую сумму кратную 100,50 или 20");
            }
            if (sum % 100 == 0 || sum % 50 == 0 || sum % 20 == 0 && x != 0) {
                x = stovage.getCashBankomat() - sum;
            }
        } else {
            System.out.println("Недостаточно средств.");
        }
        return stovage.setCashBankomat(x);
    }
}
