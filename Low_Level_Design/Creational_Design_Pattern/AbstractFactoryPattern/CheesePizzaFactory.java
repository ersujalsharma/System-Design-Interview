package Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern;

import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.Factory.DoughFactory;
import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.Factory.SauceFactory;
import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.Factory.ToppingFactory;
import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.PizzaProducts.Dough;
import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.PizzaProducts.Sauce;
import Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern.PizzaProducts.Topping;

class CheesePizzaFactory implements AbstractFactoryMethodPizza {

    @Override
    public Dough prepareDough(String val) {
        return DoughFactory.prepareDough(val);
    }

    @Override
    public Sauce prepareSauce(String val) {
        return SauceFactory.prepareSauce(val);
    }

    @Override
    public Topping prepareToppings(String val) {
        return ToppingFactory.prepareToppings(val);
    }
}