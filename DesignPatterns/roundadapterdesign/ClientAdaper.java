public class ClientAdaper {

    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(5);
        RoundPegs roundPegs = new RoundPegs(5);

        if (roundHole.fits(roundPegs))
            System.out.println("fits");

        SquarePegs smalllsquarePegs = new SquarePegs(2);
        SquarePegs largesquarepegs = new SquarePegs(20);

        SquarePegAdapter smallsquareadapter = new SquarePegAdapter(smalllsquarePegs);
        SquarePegAdapter largesquareadapter = new SquarePegAdapter(largesquarepegs);

        if (roundHole.fits(smallsquareadapter)) {
            System.out.println("square peg w2 fits round ");
        }

        if (!roundHole.fits(largesquareadapter)) {
            System.out.println("square hole does not fit into r5");
        }

    }
}
