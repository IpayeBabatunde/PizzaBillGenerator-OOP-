  public class Main {
    public static void main(String[] args) {
//        Pizza basePizza =new Pizza(true);
//        basePizza.addExtraCheese();
//        basePizza.addExtraToppings();
//        basePizza.takeAway();
//        basePizza.getBill();

        DeluxPizza newDelux = new DeluxPizza(false);
        newDelux.addExtraCheese();
        newDelux.addExtraToppings();
        newDelux.takeAway();
        newDelux.getBill();

    }
}