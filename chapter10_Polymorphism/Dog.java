package chapter10_Polymorphism;

public class Dog extends Animal{
    @Override
    public void makesound(){

        System.out.println(" Bow Bow");
    }

    public void fetch(){
        System.out.println("Dog fetch for fun");
    }


}
