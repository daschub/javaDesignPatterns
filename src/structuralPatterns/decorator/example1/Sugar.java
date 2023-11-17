package structuralPatterns.decorator.example1;

public class Sugar extends AddOn {
    public Sugar(Beverage beverage) {
        super("Sugar", beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }
}
