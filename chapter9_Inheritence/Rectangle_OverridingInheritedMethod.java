package chapter9_Inheritence;

public class Rectangle_OverridingInheritedMethod {
     protected double length;
    protected double width;
    protected double side=4;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double perimeter(){//this method is created for example of Method Overriding
        return (2*length)+(2*width);
    }
    public void print(){
        System.out.println("Super class :Method PRINT()");
    }


}
