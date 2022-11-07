package chapter10_Polymorphism;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky= new Dog();
        rocky.makesound();
        rocky.fetch();
       feed(rocky);

        Animal ruby= new Dog();
        ruby.makesound();
      feed(ruby);
        ruby=new Cat();
        ruby.makesound();
        ( (Cat)ruby).scratch();
       feed(ruby);
    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("\nDog will eat Padogree");
        } else if (animal instanceof Cat) {
            System.out.printf("Cat will drink milk");
        }
    }
}

/*
Type vs Instance An object can have a superclass type, and a subclass instance.

Access

Polymorphic objects can only access the methods of their type (not their instance). Casting is required in order to access the methods of their instance.

Overridden Methods If a method is overridden by the subclass, the polymorphic object will execute the overridden

method at runtime

instance Of Operator The instanceof operator is used to determine if

an object is an instance of a certain class

 */
