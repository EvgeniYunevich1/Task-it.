public class zadacha7 {
    public static void main(String[] args) {
        int a = 11;
        int b = 5;
        int c = 3;
        int d = 5;
        int e = 15;
        int f = 5;
        if ((a + c) <= e || (b + d) <= f) {
            System.out.println("можно");
        } else if ((a + c) <= f || (b + d) <= e) {
            System.out.println("можно");
        } else if ((a + d) <= f || (b + c) <= e) {
            System.out.println("можно");
        } else if ((a + d) <= e || (b + c) <= f) {
            System.out.println("можно");
        } else {
            System.out.println("нельзя");

        }
    }
}