package chapter10_Polymorphism;

public class Apple extends Fruit{
    @Override
    public  void calories(){
        System.out.println("Apple: 14 claories");
    }
    public void removeSeeds(){
        System.out.println("Remove seeds while eating an Apple");
    }
}
