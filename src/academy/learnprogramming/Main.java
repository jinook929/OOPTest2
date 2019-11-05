package academy.learnprogramming;

class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;
//    private boolean lettuce;
//    private boolean tomato;
//    private boolean carrot;
//    private boolean cheese;
//    private int totalAdditions = 0;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

//    public int getTotalAdditions() {
//        return totalAdditions;
//    }
//
//    public void addTotalAdditions() {
//        this.totalAdditions++;
//    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

//    public void setLettuce(boolean lettuce) {
//        this.lettuce = lettuce;
//        if(this.lettuce) {
//            this.addTotalAdditions();
//        }
//    }
//
//    public void setTomato(boolean tomato) {
//        this.tomato = tomato;
//        if(this.tomato) {
//            this.addTotalAdditions();
//        }
//    }
//
//    public void setCarrot(boolean carrot) {
//        this.carrot = carrot;
//        if(this.carrot) {
//            this.addTotalAdditions();
//        }
//    }
//
//    public void setCheese(boolean cheese) {
//        this.cheese = cheese;
//        if(this.cheese) {
//            this.addTotalAdditions();
//        }
//    }

    public double totalPrice() {

        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is $" + this.price);
        if(this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra $" + this.addition1Price);
        }
        if(this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra $" + this.addition2Price);
        }
        if(this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra $" + this.addition3Price);
        }
        if(this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra $" + this.addition4Price);
        }

        return hamburgerPrice;
    }
}

public class Main {

    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("Bills Burger", "White", "Beef", 2.50);
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

    }
}
