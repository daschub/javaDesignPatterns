package structuralPatterns.decorator.example1;

public class Milk extends AddOn {

    public Milk(Beverage beverage) {
        super("Milk", beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }
}
