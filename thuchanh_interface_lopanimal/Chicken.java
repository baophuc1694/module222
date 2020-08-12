package thuchanh_interface_lopanimal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: cục cục cục.... cục kit.....";
    }
    @Override
    public String howToEat(){
        return "Could be fried";
    }
}
