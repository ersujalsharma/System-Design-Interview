package Low_Level_Design.MachineCodingRound.Design_Coffee_Vending_Machine;

import java.util.Scanner;

public interface State {
    public void selectItems(CoffeeVendingMachine coffeeVendingMachine,Scanner scanner);
    public void dispatchItems(CoffeeVendingMachine coffeeVendingMachine);
    public void cancelTransaction(CoffeeVendingMachine coffeeVendingMachine);
}
