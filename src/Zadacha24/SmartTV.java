package Zadacha24;

public class SmartTV extends Texnika {
    public void SerfInternet() {
        System.out.println("искать в интернете");
    }

    public void name() {
        System.out.println(name);
    }

    protected boolean state = true;

    public void on() {
        state = true;
    }

    public void off() {
        state = false;
    }

    public void printState() {
        if (state) {
            System.out.println("TV On");
        } else {
            System.out.println("TV Off");
        }
    }
}
