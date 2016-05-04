public class VeggieTrioPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildDough() {
        pizza.setDough("Homemade");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("boyardee");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings("Pepperoni");
    }
}
