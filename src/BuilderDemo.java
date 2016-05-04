public class BuilderDemo {
    public static void main(String[] args) {

        Waiter waiter = new Waiter();
        PizzaBuilder magarithaPizzaBuilder = new MagarithaPizzaBuilder();
        waiter.setPizzaBuilder(magarithaPizzaBuilder);
        waiter.constructPizza();
        Pizza magarithaPizza = waiter.getPizza();


        PizzaBuilder vaggieTrioPizzaBuilder =new VeggieTrioPizzaBuilder();
        waiter.setPizzaBuilder(vaggieTrioPizzaBuilder);
        waiter.constructPizza();
        Pizza vaggieTrioPizza = waiter.getPizza();

    }
}
