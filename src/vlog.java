public class vlog {
    public static void main(String[] args) {
        int mas []={1,2,3,4,5};
        System.out.println();
        int b;
        for(int i=0;i<mas.length/2;i++){
            b=mas[mas.length-i-1];
            mas[mas.length-i-1]=mas[i];
            mas[i]=b;

        }
        for(int i=0;i<mas.length;i++)
            System.out.print(mas[i]);
    }
}
