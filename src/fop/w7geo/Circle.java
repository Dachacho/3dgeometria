package fop.w7geo;

public class Circle extends BaseArea {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double circumference() {
        return Math.PI*2*radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
