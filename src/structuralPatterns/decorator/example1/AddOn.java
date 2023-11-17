package structuralPatterns.decorator.example1;



public abstract class AddOn extends Beverage {
    protected Beverage beverage;                                    // aggregation

    public AddOn(String description, Beverage beverage) {           // aggregation
        super(description);
        this.beverage = beverage;
    }

    public abstract String getDescription();
}
