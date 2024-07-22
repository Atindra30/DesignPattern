package product.pizza;

public class PepperoniPizza extends Pizza{
    @Override
    public void assemble() {
        System.out.println("Creating crust "+crust);
        System.out.println("Adding sauce "+sauce);
        System.out.println("Adding Toppings "+toppings);
        System.out.println("Adding cheese & Pepperoni");

    }

    @Override
    public void qualityCheck() {
        System.out.println("Quality checked for Pepperoni pizza");


    }
}
