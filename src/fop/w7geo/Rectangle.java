package fop.w7geo;

public class Rectangle extends BaseArea {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double circumference() {
        return 2 * (width + height);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public boolean isSquare() {
        return width == height;
    }

    @Override
    public Square toSquare(){
        if(this.isSquare()){
            return new Square(width);
        }else{
            return null;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
