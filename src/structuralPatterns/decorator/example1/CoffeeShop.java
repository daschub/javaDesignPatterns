package structuralPatterns.decorator.example1;

public class CoffeeShop {
    public static void main(String[] args) {

        HouseBlend houseBlend = new HouseBlend("House Blend");
        System.out.println(houseBlend.getDescription() + ": " + houseBlend.cost());

        Milk milkAddOn = new Milk(houseBlend);
        System.out.println(milkAddOn.getDescription() + ": " + milkAddOn.cost());

        Sugar sugarAddOn = new Sugar(milkAddOn);
        System.out.println(sugarAddOn.getDescription() + ": " + sugarAddOn.cost());
    }
}
