package DesignPatterns.StrategyDuck;

public class Quack implements QuackBehaviour {

    public Quack() {
    }

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        System.out.println(" duck quack");
    }

}
