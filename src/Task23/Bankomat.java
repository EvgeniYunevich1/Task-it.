package Task23;


import Task23.Stovage;

public class Bankomat  {
    public int calculeitCash;
    public int x;
   Stovage stovage=new Stovage();

    public int calculeitCash(int sum) {
        x=stovage.CashBancomat();
        if (sum <=x) {
            if (sum % 100 == 0 || sum % 50 == 0 || sum % 20 == 0) {
                System.out.println("Выдано денег = " + sum);
            } else {
                System.out.println("введите другую сумму");
            }
            if (sum % 100 == 0 || sum % 50 == 0 || sum % 20 == 0 && x != 0) {
                x = stovage.CashBancomat() - sum;
            }
        } else {
            System.out.println("недостаточно средств");
        }
        return  x;
    }
}
