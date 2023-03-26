package DesignPatterns.StrategyDuck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println(" i am model duck");
    }

    public static void main(String[] args) {
        
        Duck duck = new ModelDuck();

        // run time poluymorphism

        // call setter method

        duck.performFly();
        duck.performQuack();
        duck.setFlyBehaviour(new FLyRocketPower());
        duck.performFly();
        duck.display();
    }

}
