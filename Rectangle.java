package Laba34;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle( ) {
        this.width = 10.0;
        this.length = 0.0;
        this.filled = false;
        this.color = "blue";
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.filled = false;
        this.color = "blue";
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public double getLength() {

        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return
                width*length;
    }

    public double getPerimeter() {
        return
                2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}