package DesignPatterns.StrategyGame;

public abstract class Game {


    /*
     * strategy pattern defines a family of algorith, incaptulates each one make them use interchangable.
     */

    WeaperBehaviour weaperBehaviour;

    public void useWapon() {
        weaperBehaviour.useWapon();
    }

    public abstract void fight();

    public void setWapon(WeaperBehaviour weaperBehaviour) {
        this.weaperBehaviour = weaperBehaviour;
    }

}
