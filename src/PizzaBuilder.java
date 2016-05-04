abstract class PizzaBuilder {
    protected Pizza pizza;

    Pizza getPizza(){
      return new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildToppings();
}