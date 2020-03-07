package Zadacha24;

public class SmartTV extends TV {
    public void SerfInternet() {
        System.out.println("ищет в интернете");
    }

    public void name() {
        System.out.println(name);
    }

    protected boolean state = true;

    public void on() {
        state = true;
        System.out.println("TV On");
    }

    public void off() {
        state = false;
        System.out.println("TV Off");
    }
}