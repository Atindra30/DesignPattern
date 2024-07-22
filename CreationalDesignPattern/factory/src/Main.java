import product.burger.Burger;
import restaurantFactory.ChickenBurgerRestaurant;
import restaurantFactory.Restaurant;
import restaurantFactory.VeggieBurgerRestaurant;

public class Main {
    public static void main(String[] args) {

        Restaurant chickenBurgerRestaurant=new ChickenBurgerRestaurant();
        chickenBurgerRestaurant.orderBurger();

        Restaurant veggieBurgerRestaurant=new VeggieBurgerRestaurant();
        veggieBurgerRestaurant.orderBurger();


    }
}