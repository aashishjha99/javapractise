public class SquarePegAdapter extends RoundPegs {

    private SquarePegs squarePegs;

    public SquarePegAdapter(SquarePegs squarePegs) {
        this.squarePegs = squarePegs;
    }

    @Override
    public double getRadius() {
        return (Math.sqrt(Math.pow((squarePegs.getWidth() / 2), 2) * 2));
    }

}
