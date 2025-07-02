package Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern;

import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.PizzaProducts.Dough;
import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.PizzaProducts.Sauce;
import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.PizzaProducts.Topping;

public interface AbstractFactoryMethodPizza {
    Dough prepareDough(String val);
    Sauce prepareSauce(String val);
    Topping prepareToppings(String val);
}