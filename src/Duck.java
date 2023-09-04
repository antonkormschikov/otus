public class Duck extends Animal implements IFlying{
    @Override
    public void Say(){
        System.out.println("Кря");
    }
    public void fly(){
        System.out.println("Я летаю!");
    }
}
