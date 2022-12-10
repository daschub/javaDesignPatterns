package structuralPatterns.decorator.example1;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        super("Dark Roast");
    }

    @Override
    public double cost() {
        return 4.00;
    }
}
