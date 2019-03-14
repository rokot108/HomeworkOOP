package polymorph;

public class Round implements Figure {

    private double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
