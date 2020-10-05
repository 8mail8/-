package Laba34;

public class Square extends Rectangle {
    protected double side;

    public Square() {
        this.filled = false;
        this.color = "blue";
        this.side = 10.0;
    }

    public Square(double side) {
        this.filled = false;
        this.color = "blue";
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side, double length) {
        this.length = length;
        this.side = side;
    }

    public void setWidth(double side, double width) {
        this.width = width;
        this.side = side;
    }

    public void setLenght(double lenght) {
        this.length = lenght;
    }
    @Override
    public double getArea() {

        return side*side;
    }

    @Override
    public double getPerimeter() {

        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}