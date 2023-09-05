package animals.birds;
import animals.*;

public class Duck extends Animal implements IFlying {
    public Duck(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    public Duck() {
    }

    @Override
    public void say(){
        System.out.println("Кря");
    }
    public void fly(){
        System.out.println("Я летаю!");
    }
}
