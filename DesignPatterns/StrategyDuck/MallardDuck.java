package DesignPatterns.StrategyDuck;

public class MallardDuck extends Duck {

    /**
     * 
     */
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new Fly();
    }

    @Override
    public void display() {

        System.out.println("i am reald mallared duck");

    }

    public static void main(String[] args) {
        
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();
    }

}
