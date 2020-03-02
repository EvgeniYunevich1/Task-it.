package Lesson6;

public class Bankomat {
    private int naminal100;
    private int naminal20;
    private int naminal50;
    private int namimal100;
    private boolean peremenai;
    Stovage addCash = new Stovage();

    public Bankomat(int naminal20, int naminal50, int namimal100) {
        this.naminal20 = naminal20;
        this.naminal50 = naminal50;
        this.namimal100 = namimal100;
    }

    public void addCashNaminal(int namimal100, int naminal50, int naminal20) {
        this.namimal100 += namimal100;
        this.naminal50 += naminal50;
        this.naminal20 += naminal20;
    }

    public boolean calculeitCash(int sum) {
        int outnaminal20 = 0, outnaminal50 = 0, outnaminal100 = 0;
        int addCash = namimal100 * 100 + naminal20 * 20 + naminal50 * 50;
        if (sum <= addCash) {
            if (naminal100 >= (sum / 100)) {
                outnaminal100 = sum / 100;
            } else {
                outnaminal100 = naminal100;
            }
        }
        sum -= outnaminal100;
        if (sum > 0) {
            if (naminal50 >= (sum / 50)) {
                outnaminal50 = sum / 50;
            } else {
                outnaminal50 = naminal50;
            }
        }
        sum -= outnaminal50;
        if (sum > 0) {
            if (naminal20 >= (sum / 20)) {
                outnaminal20 = sum / 20;
            } else {
                outnaminal20 = naminal20;
            }
        }
        if (sum == 0) {
            peremenai = true;
            System.out.printf("Выдало наминалом 100 %s, наминалом 50 %s,наминалом 20 %s", outnaminal100, outnaminal50, outnaminal20);
        } else {
            System.out.println("Ведите другую суму");
        }
        naminal20 -= outnaminal20;
        naminal50 -= outnaminal50;
        namimal100 -= outnaminal100;
        return peremenai;
    }
}
