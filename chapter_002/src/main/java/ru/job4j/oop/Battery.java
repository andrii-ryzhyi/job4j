package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(30);
        Battery battery2 = new Battery(50);
        System.out.println("Battery 1 charge: " + battery1.load);
        System.out.println("Battery 2 charge: " + battery2.load);
        battery1.exchange(battery2);
        System.out.println("Exchange...");
        System.out.println("Battery 1 charge: " + battery1.load);
        System.out.println("Battery 2 charge: " + battery2.load);

    }
}
