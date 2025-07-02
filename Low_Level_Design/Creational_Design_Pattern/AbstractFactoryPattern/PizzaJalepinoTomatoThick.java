package Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern;

public class PizzaJalepinoTomatoThick extends CheesePizzaFactory {
    public static void main(String[] args) {
        PizzaJalepinoTomatoThick pizza = new PizzaJalepinoTomatoThick();
        pizza.prepareDough("Thick");
        pizza.prepareSauce("Tomato");
        pizza.prepareToppings("Jalepino");
        System.out.println("Pizza Jalepino Tomato Thick is ready!");
    }
}
