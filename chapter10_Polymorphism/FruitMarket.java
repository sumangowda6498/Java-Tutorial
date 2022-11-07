package chapter10_Polymorphism;

public class FruitMarket {
    public static void main(String[] args) {
        Fruit fruit=new Fruit();
        fruit.calories();

        Fruit bananas=new Banana();
        bananas.calories();

        Banana banana=new Banana();
        banana.calories();
        banana.peel();
       price(banana);

        Apple apple=new Apple();
        apple.calories();
        apple.removeSeeds();
        price(apple);

    }
    public static void price(Fruit fruitty){
        if(fruitty instanceof Apple){
            System.out.println("Apple price: 50Rs/kg");
        } else if (fruitty instanceof Banana) {
            System.out.println("Banana price: 20Rs/kg");
        }

    }
}
