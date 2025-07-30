package Low_Level_Design.MachineCodingRound.Design_Coffee_Vending_Machine;

import java.util.Scanner;

public class DispatchState implements State {

    @Override
    public void selectItems(CoffeeVendingMachine coffeeVendingMachine,Scanner scanner) {
        // TODO Auto-generated method stub
        System.out.println("Already Selected Item.. Either Dispatch or Cancel");
    }

    @Override
    public void dispatchItems(CoffeeVendingMachine coffeeVendingMachine) {
        // TODO Auto-generated method stub
        System.out.println("Dispatching Selected Item .....");
        // logic will come of beverage making.
        System.out.println("Transaction is complete. Thank you!");
        coffeeVendingMachine.setState(new IdleState());
    }

    @Override
    public void cancelTransaction(CoffeeVendingMachine coffeeVendingMachine) {
        // TODO Auto-generated method stub
        System.out.println("Canceled transaction ...... ");
        System.out.println();
        coffeeVendingMachine.setState(new IdleState());
    }
    
}
