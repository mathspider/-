package Week9;

public class Rectangle implements Comparable<Rectangle> {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

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

    @Override
    public int compareTo(Rectangle o) {
        if (this.length*this.width==o.width*o.length){
            return (int)(this.length+this.width-o.length-o.width);
        }else{
            return  (int)(this.length*this.width-o.width*o.length);
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
