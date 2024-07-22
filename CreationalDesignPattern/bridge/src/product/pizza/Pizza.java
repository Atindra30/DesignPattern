package product.pizza;


public abstract class Pizza {

    protected String crust;
    protected String sauce;
    protected String toppings;

    public abstract void assemble();

    public abstract void qualityCheck();


    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
}
