package restaurantFactory;

import product.burger.Burger;
import product.burger.ChickenBurger;


public class ChickenBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new ChickenBurger();
    }

}
