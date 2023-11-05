package fop.w7geo;

public class Prism {
    private double height;
    private BaseArea base;

    public Prism(BaseArea base, double height) {
        this.height = height;
        this.base = base;
    }

    public double surface() {
        return (2 * base.area()) + base.circumference() * height;
    }

    public double volume() {
        return base.area() * height;
    }

    public boolean isCube() {
        return base.isSquare() && base.toSquare() != null && height == base.toSquare().getLength();
    }

}
