public class zadacha2 {
    public static void main(String[] args) {
       int s =3700;
       int sec;
       int m;
       int min,h;
       int syt;
       int ned;
       sec=s%60;
       m=(s-sec)/60;
       min = m% 60;
       h=(m-min)/60;
       syt=h/24;
       ned=syt/7;
        System.out.println(ned+"недель"+syt+"суток"+h+"часов"+min+"минут"+s+"секунд");


    }
}
