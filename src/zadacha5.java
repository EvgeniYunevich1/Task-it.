public class zadacha5 {
    public static void main(String[] args) {
        int a=8;
        int b=5;
        int c = 6;
        int d =4;
        int e =7;
        int f =8;
        int plochat1=a*b;
        int plochat2=c*d;
        int plochatYchastka=e*f;
        if (plochatYchastka>plochat1) {
            if (plochatYchastka > plochat2)
                System.out.println("дома помещаются");
        }else {
            System.out.println("дома не помещатся");
        }
    }
}
