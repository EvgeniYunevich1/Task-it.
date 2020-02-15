public class zadacha1 {
    public static void main(String[] args) {
        int s=3700;
        int sec;
        int m;
        int min,h;
        int syt;
        int n;
        sec =s % 60;
        m = (s-sec)/60;
        min = m % 60;
        h=(m-min)/60;
        syt=h /24;
        n=syt/7;
               System.out.println(n+"недель"+syt+"суток"+h+"часов"+min+"минут"+sec+"секунды");
    }
}
