package product.burger;

import product.burger.Burger;

public class ChickenBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing chicken burger");
    }
}
