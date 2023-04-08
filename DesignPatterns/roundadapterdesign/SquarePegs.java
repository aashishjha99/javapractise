public class SquarePegs {

    private double width;

    public double getWidth() {
        return width;
    }

    public SquarePegs() {
    }

    public SquarePegs(double width) {
        this.width = width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }

}
