package DesignPatterns.StrategyDuck;


// strategy pattern 

public abstract class Duck {

    FlyBehaviour flyBehaviour;

    QuackBehaviour quackBehaviour;

    public abstract void display();

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setQuackBehavior(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;

    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }


    public void performFly() {
        flyBehaviour.fly();
    }

    public void swim() {
        System.out.println("all duck will swim");
    }

}
