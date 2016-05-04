class Waiter {

    private PizzaBuilder pizzaBuilder;

    void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    Pizza getPizza(){
       return pizzaBuilder.getPizza();
    }


    void constructPizza(){
        pizzaBuilder.createPizza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildToppings();
    }
}
