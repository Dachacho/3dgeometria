package fop.w7geo;

public class Main {
    public static void main(String[] args) {
        BaseArea baseArea = new Rectangle(12,12);
        Prism prism = new Prism(baseArea, 12);
        System.out.println(prism.isCube());
    }
}
