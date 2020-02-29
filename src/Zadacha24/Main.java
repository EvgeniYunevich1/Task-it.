package Zadacha24;
//Создать иерархию классов и включить часть обьектов.
public class Main {
    public static void main(String[] args) {
        SmartTV smartTV= new SmartTV();
        TV tv = new TV();
         tv.TVoff();
         tv.TVon();
         tv.ShowCinema();
         tv.name();
         smartTV.SerfInternet();
         smartTV.name();
         smartTV.printState();
    }
}
