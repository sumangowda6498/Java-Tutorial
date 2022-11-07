package chapter10_Polymorphism;

public class Banana extends Fruit {
    @Override
    public void calories(){
        System.out.println("Banana : 72 calories");
    }
    public void peel(){
        System.out.println("Peel the banana before yo eat");
    }
}
