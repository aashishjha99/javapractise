
public class RoundHole {

    private double radius;
    

    public RoundHole() {
    }

    public RoundHole(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }


    public boolean fits(RoundPegs roundpegs) {
        return this.getRadius() >= roundpegs.getRadius();

    }
}