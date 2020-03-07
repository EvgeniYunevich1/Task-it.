package Zadacha24;

//Создать иерархию классов и включить часть обьектов.
public class Main {
    public static void main(String[] args) {
        Texnika texnika= new Texnika();
        SmartTV smartTV = new SmartTV();
        TV tv = new TV();
        System.out.println(texnika.name);
        tv.ShowCinema();
        tv.name();
        smartTV.SerfInternet();
        smartTV.name();
        smartTV.ShowCinema();
        smartTV.on();
    }
}
