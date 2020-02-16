public class zadacha5 {
    public static void main(String[] args) {
        int rybli = 1;
        int a = rybli % 100;
        int b = rybli % 10;
        if (b == 1 & a != 11) {
            System.out.println(rybli + "рубль");
        }
        if (a > 1 && a < 5 || b > 1 && a < 5) {
            System.out.println(rybli + "рубля");
        }
        if (a < 20 && a > 9 || b > 4 && b < 10) {
            System.out.println(rybli + "рублей");
        }
    }
}
