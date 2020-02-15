public class zadacha3 {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int r=5;
        int r2=r*r;
        int ploschat;
        double ploschaR;
        ploschat=a*b;
        ploschaR=3.14*r2;
        if(ploschaR>ploschat){
            System.out.println("можно закрыть кругом");
        } else{
            System.out.println("нельзя закрыть");
        }
    }
}
