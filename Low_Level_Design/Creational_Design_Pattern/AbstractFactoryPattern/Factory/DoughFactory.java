package Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.Factory;

import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.PizzaProducts.Dough;
import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.PizzaProducts.ThickDough;

public class DoughFactory {
    public static Dough prepareDough(String val) {
        if (val.equalsIgnoreCase("thick")) {
            return new ThickDough();
        } else {
            throw new UnsupportedOperationException("Unsupported dough type: " + val);
        }
    }
}
