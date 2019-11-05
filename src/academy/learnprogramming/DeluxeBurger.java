package academy.learnprogramming;

public class DeluxeBurger extends Hamburger {

//    private String chipsName;
//    private double chipsPrice;
//    private String drinkName;
//    private double drinkPrice;

    public DeluxeBurger() {
        super("Deluxe", "Whole Wheat", "Sausage + Bacon", 4.25);
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.80);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
