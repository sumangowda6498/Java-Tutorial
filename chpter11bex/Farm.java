package chpter11bex;

public class Farm {
    public static void main(String[] args) {
        Animal donald= new Duck();
        donald.makesound();
        donald.eat();;

        Duck dafffy=new Duck();
        dafffy.makesound();
        dafffy.eat();

        Pig prokky=new Pig();
        prokky.makesound();
        prokky.eat();
    }

}
