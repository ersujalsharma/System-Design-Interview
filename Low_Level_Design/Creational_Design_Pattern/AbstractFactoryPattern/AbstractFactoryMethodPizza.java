package Low_Level_Design.Creational_Design_Pattern.AbstractFactoryPattern;

public interface AbstractFactoryMethodPizza {
    Dough prepareDough(String val);
    Sauce prepareSauce(String val);
    Topping prepareToppings(String val);
}