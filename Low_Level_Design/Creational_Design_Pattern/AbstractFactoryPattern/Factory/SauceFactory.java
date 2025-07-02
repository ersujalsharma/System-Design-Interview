package Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.Factory;

import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.PizzaProducts.Sauce;
import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.PizzaProducts.TomatoSauce;

public class SauceFactory {
    public static Sauce prepareSauce(String val) {
        if (val.equalsIgnoreCase("tomato")) {
            return new TomatoSauce();
        } else {
            throw new UnsupportedOperationException("Unsupported sauce type: " + val);
        }
    }
}
