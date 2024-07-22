package product.burger;

import product.burger.Burger;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie burger");
    }
}
