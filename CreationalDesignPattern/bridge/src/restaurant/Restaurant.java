package restaurant;

import product.pizza.Pizza;

public abstract class Restaurant {

    //Bridge
    protected Pizza pizza;

    Restaurant(Pizza pizza){
        this.pizza=pizza;
    }

    abstract void makeCrust();
    abstract void addSauce();
    abstract void addToppings();

    public void deliver(){
        makeCrust();
        addSauce();
        addToppings();
        pizza.assemble();
        pizza.qualityCheck();

    }


}
