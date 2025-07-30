package Low_Level_Design.MachineCodingRound.Design_Coffee_Vending_Machine;

import java.util.Scanner;

public class IdleState implements State {

    @Override
    public void selectItems(CoffeeVendingMachine coffeeVendingMachine,Scanner scanner) {
        // TODO Auto-generated method stub
        coffeeVendingMachine.printList();
        System.out.println("Select Item you want to dispatch");
        int choosed = scanner.nextInt();
        coffeeVendingMachine.setSelectedItem(choosed);
        coffeeVendingMachine.setState(new DispatchState());
    }

    @Override
    public void dispatchItems(CoffeeVendingMachine coffeeVendingMachine) {
        // TODO Auto-generated method stub
        System.out.println("First Select the Item ...... ");
        System.out.println();
        coffeeVendingMachine.setState(new IdleState());
    }

    @Override
    public void cancelTransaction(CoffeeVendingMachine coffeeVendingMachine) {
        // TODO Auto-generated method stub
        System.out.println("There is not any transaction going on ...... ");
        coffeeVendingMachine.setState(new IdleState());
    }
    
}
