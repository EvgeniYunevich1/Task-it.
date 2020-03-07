package Zadacha22;

import org.jetbrains.annotations.NotNull;

public class Time {
    private int hour;
    private int minuts;
    private int second;
    private int returnAllSecond;

    public Time(int hour, int minuts, int second) {
        this.hour = hour;
        this.minuts = minuts;
        this.second = second;
    }

    public Time(int AllSecond) {

        second = AllSecond;
    }

    public int returnAllSecond() {
        return hour * 3600 + minuts * 60 + second;
    }


    public int getreturnAllSecond() {

        return returnAllSecond();
    }

    public void setreturnAllSecond(int returnAllSecond) {

        this.returnAllSecond = returnAllSecond;
    }

    public int getHour() {

        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinuts() {

        return minuts;
    }

    public void setMinuts(int minuts) {

        this.minuts = minuts;
    }

    public int getSecond() {

        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public static class Object {
        public static int Sravnenie(@NotNull Time Object1, @NotNull Time Object2) {
            if (Object1.getSecond() == Object2.getreturnAllSecond()) {
                System.out.println("Object1=Object2");
            }
            if (Object1.getSecond() > Object2.getreturnAllSecond()) {
                System.out.println("Object1>Object2");
            }
            if (Object1.getSecond() < Object2.getreturnAllSecond()) {
                System.out.println("Object1<Object2");
            }

            return Object1.getSecond() - Object2.getreturnAllSecond();
        }
    }


}