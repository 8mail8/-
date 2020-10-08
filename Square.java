package Laba34;

public class Square<publiс> extends Rectangle {

    public Square() {
        this.filled = false;
        this.color = "blue";
        this.width = 10.0;
        this.length = 10.0;

    }

    public Square(double side) {
        this.filled = false;
        this.color = "blue";
        this.width = side;
        this.length = side;

    }

    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.width = side;
        this.length = side;
    }
    public double getSide() {
    return getWidth();
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
