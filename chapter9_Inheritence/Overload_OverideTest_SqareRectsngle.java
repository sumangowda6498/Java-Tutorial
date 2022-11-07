package chapter9_Inheritence;

import java.awt.*;



public class Overload_OverideTest_SqareRectsngle {
    public static void main(String[] args){

        Rectangle_OverridingInheritedMethod rectangle = new Rectangle_OverridingInheritedMethod();
        rectangle.print();

        Square square= new Square();
        square.print("SQUARE");
}

public static void RectangleTestOverrid(){
    Rectangle_OverridingInheritedMethod rectangle= new Rectangle_OverridingInheritedMethod();
    rectangle.setLength(4);
}}
