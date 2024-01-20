package chapter10;

public class Market {
    public static void main(String[] args){
        Fruite apple = new Apple();
        ((Apple) apple).removeSeeds();

        Apple apple2 = new Apple();
        apple2.removeSeeds();

        Banana banana = new Banana();
        banana.peel();

        Fruite banana2 = new Banana();
        ((Banana) banana2).peel();

        Fruite orange = new Fruite();

        squeeze(apple);
        squeeze(banana);
        squeeze(banana2);
        squeeze(orange);

    }

    public static void squeeze(Fruite fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();
    }
}

