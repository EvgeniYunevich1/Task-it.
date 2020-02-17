public class zadacha4 {
    public static void main(String[] args) {
        int a = 15;
        int b = 1;
        int r = 1;
        int cE2 = (a * a) + (b * b);
        double c = Math.sqrt(cE2);
        if (c < 2 * r) {
            System.out.println("можно закрыть");
        } else {
            System.out.println("нельзя закрыть");

        }
    }
}
