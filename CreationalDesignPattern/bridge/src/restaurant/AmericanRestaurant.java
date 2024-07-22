package restaurant;

import product.pizza.Pizza;

public class AmericanRestaurant extends Restaurant{


    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thick");

    }

    @Override
    void addSauce() {
        pizza.setSauce("American special sauce");

    }

    @Override
    void addToppings() {
        pizza.setToppings("corn");
    }
}
