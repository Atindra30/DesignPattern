package restaurant;

import product.pizza.Pizza;

public class ItalianRestaurant extends Restaurant{
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thin");
    }

    @Override
    void addSauce() {
        pizza.setSauce("Italian sauce");

    }

    @Override
    void addToppings() {
        pizza.setToppings("Olive, Capsicum and Onion");

    }
}
