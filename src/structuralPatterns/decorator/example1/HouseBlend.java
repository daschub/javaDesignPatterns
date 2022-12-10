package structuralPatterns.decorator.example1;

public class HouseBlend extends Beverage {

    public HouseBlend(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 3.50;
    }
}
