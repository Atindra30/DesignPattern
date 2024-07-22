package restaurantFactory;

import product.burger.Burger;
import product.burger.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }


}
