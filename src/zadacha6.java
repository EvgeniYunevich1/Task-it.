public class zadacha6 {
    public static void main(String[] args) {
        int d = 28;
        int m = 2;
        int g = 2564;
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
            if (d > 1 && d < 31) {
                d++;
                System.out.println(d + " " + m + " " + g);
            } else if (d == 31) {
                d = 1;
                m++;
                System.out.println(d + " " + m + " " + g);
            }
        }
        if (m == 12) {
            if (d > 1 && d < 31) {
                d++;
                System.out.println(d + " " + m + " " + g);
            } else if (d == 31) {
                d = 1;
                m = 1;
                g++;
                System.out.println(d + " " + m + " " + g);
            }
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d > 1 && d < 30) {
                d++;
                System.out.println(d + " " + m + " " + g);
            } else if (d == 30) {
                d = 1;
                m++;
                System.out.println(d + " " + m + " " + g);
            }
        }
        if (m == 2 & g % 4 == 0 || g % 400 == 0) {
            if (d > 1 & d < 29) {
                d++;
                System.out.println(d + " " + m + " " + g);
            } else if (d == 29) {
                d = 1;
                m++;
                System.out.println(d + " " + m + " " + g);
            }
        }
        if (m == 2) {
            if (d > 1 & d < 28) {
                d++;
                System.out.println(d + " " + m + " " + g);
            } else if (d == 28) {
                d = 1;
                m++;
                System.out.println(d + " " + m + " " + g);
            }
        }


    }
}



