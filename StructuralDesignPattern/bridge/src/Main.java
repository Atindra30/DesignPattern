import product.pizza.PepperoniPizza;
import product.pizza.VeggiePizza;
import restaurant.AmericanRestaurant;
import restaurant.ItalianRestaurant;
import restaurant.Restaurant;

public class Main {
    public static void main(String[] args) {

        Restaurant americanRestaurant=new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        Restaurant ItalianRestaurant=new ItalianRestaurant(new VeggiePizza());
        americanRestaurant.deliver();


    }
}