package DesignPatterns.StrategyGame;

public class King extends Game {

    public King() {
        weaperBehaviour = new BowAndArrow();
    }

    @Override
    public void fight() {
        // TODO Auto-generated method stub
        System.out.println("king is fighting");
    }

    public static void main(String[] args) {

        Game game = new King();
        game.fight();
        game.useWapon();
        game.setWapon(new KnifeBehaviour());
        game.useWapon();

    }

}
