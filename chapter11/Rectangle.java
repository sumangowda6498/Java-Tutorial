package chapter11;

public class Rectangle extends Shape {
    private double length;
    private double bredth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBredth() {
        return bredth;
    }

    public void setBredth(double bredth) {
        this.bredth = bredth;
    }
    public Rectangle(double length,double bredth){
        setBredth(bredth);
        setLength(length);
    }

    double calculatearea(){
        return length*bredth;
    }


}
