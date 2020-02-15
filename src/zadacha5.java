public class zadacha5 {
    public static void main(String[] args) {
        int a=10;
        int b=78;
        int c = 6;
        int d =4;
        int e =7;
        int f =8;
        int plochat1=a*b;
        int plochat2=c*d;
        int plochatYchastka=e*f;
        if (plochatYchastka>plochat1) {
            System.out.println("дом 1 поместится");
        }else{
            System.out.println("дом 1 не помещается");}
            if (plochatYchastka > plochat2){
                System.out.println("дом 2 поместится");
        }else {
            System.out.println("дом 2 не помещается");
        }
    }
}
