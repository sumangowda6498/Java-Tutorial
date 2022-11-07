package chapter9_Inheritence;

public class Square extends Rectangle_OverridingInheritedMethod {
    @Override //not required but strongly encouraged
    public double perimeter(){//Overriding the method with exact same signature but changing the content of the body
        return side*length;
    }

    public void print(String prnt){
        System.out.printf("Subclass  class Square:Method PRINT() "+prnt);
    }
}
