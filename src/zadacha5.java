public class zadacha5 {
    public static void main(String[] args) {
        int rybli = 14;
        if (rybli % 10 == 1) {
            System.out.println(rybli + " " + "рубль");
        } else if (rybli % 100 >= 11 && rybli % 100 <= 20) {
            System.out.println(rybli + " " + "рублей");
        } else if (rybli % 10 == 2 || rybli % 10 == 3 || rybli % 10 == 4) {
            System.out.println(rybli + " " + "рубля");
        } else if (rybli % 10 >= 5 || rybli % 10 <= 9 || rybli % 10 == 0) {
            System.out.println(rybli + " " + "рублей");
        }
    }
}
