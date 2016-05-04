abstract class PizzaBuilder {
    Pizza pizza;

    Pizza getPizza(){
        return pizza;
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildToppings();

    void createPizza(){
        pizza = new Pizza();
    }

}