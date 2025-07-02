package Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.Factory;

import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.PizzaProducts.JalepinoToppings;
import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.PizzaProducts.Topping;

public class ToppingFactory {
     public static Topping prepareToppings(String val) {
        if (val.equalsIgnoreCase("jalepino")) {
            System.out.println("Preparing Jalepino Toppings");
            return new JalepinoToppings();
        } else {
            throw new UnsupportedOperationException("Unsupported topping type: " + val);
        }
    }
}
