package academy.learnprogramming;

//class Hamburger {
//
//}

public class Main {

    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("Basic", "White", "Beef", 2.50);
        double price = hamburger.totalPrice();
        hamburger.addHamburgerAddition1("Tomato", 0.25);
        hamburger.addHamburgerAddition2("Lettuce", 0.50);
        hamburger.addHamburgerAddition3("Cheese", 0.75);
        System.out.println("Total Burger price is $" + hamburger.totalPrice());
//        System.out.println(hamburger.getName() + " w/ " + hamburger.getTotalAdditions() + " additions : $" + hamburger.totalPrice());
//
//        HealthyBurger healthyBurger = new HealthyBurger("Fish");
//        healthyBurger.setMushroom(true);
//        healthyBurger.setMushroom(true);
//        System.out.println(healthyBurger.getName() + " w/ " + hamburger.getTotalAdditions() + " additions : $" + healthyBurger.totalPrice());
//
//        DeluxBurger deluxBurger = new DeluxBurger("Wheat Bread", "Chicken");
//        deluxBurger.setLettuce(true);
//        deluxBurger.setTomato(true);
//        deluxBurger.setCheese(true);
//        System.out.println(deluxBurger.getName() + " w/ " + (deluxBurger.getTotalAdditions() - 2) + " additions : $" + deluxBurger.totalPrice());

        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 3.25);
        healthyBurger.addHamburgerAddition1("Tomato", 0.25);
        healthyBurger.addHamburgerAddition2("Lettuce", 0.50);
        healthyBurger.addHamburgerAddition3("Cheese", 0.75);
        healthyBurger.addHamburgerAddition4("Onion", 0.30);
        healthyBurger.addHamburgerAddition5("Egg", 1.00);
        healthyBurger.addHamburgerAddition5("Mushroom", 0.80);
        System.out.println("Total Burger price is $" + healthyBurger.totalPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("Total Burger price is $" + deluxeBurger.totalPrice());
        deluxeBurger.addHamburgerAddition1("Lettuce", 0.50);
    }
}
