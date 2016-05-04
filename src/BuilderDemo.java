public class BuilderDemo {
    public static void main(String[] args) {

        Waiter waiter = new Waiter();
        PizzaBuilder magarithaPizzaBuilder = new MagarithaPizzaBuilder();
        waiter.setPizzaBuilder(magarithaPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();

    }
}
