package chapter10_Polymorphism;

public class Cat extends Animal{
    @Override
    public  void makesound(){
        System.out.println(" Meo Meo");

    }

    public void scratch(){
        System.out.printf(" Cat will scracth the objects");
    }
}
