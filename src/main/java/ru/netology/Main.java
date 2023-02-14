package ru.netology;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        //System.out.println("1." + expected + "== ? ==" + actual);

        amount = 1_000_000;
        registered = true;
        expected = 500;
        actual = service.calculate(amount, registered);
        //System.out.println("1." + expected + "== ? ==" + actual);

        amount = 4_000_000;
        registered = false;
        expected = 500;
        actual = service.calculate(amount, registered);
        //System.out.println("1." + expected + "== ? ==" + actual);

        amount = 5_000;
        registered = false;
        expected = 50;
        actual = service.calculate(amount, registered);
        // System.out.println("1." + expected + "== ? ==" + actual);


    }
}