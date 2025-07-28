package Low_Level_Design.MachineCodingRound.Design_Vending_Machine;

import Low_Level_Design.MachineCodingRound.Design_Vending_Machine.VendingMachine.Item;
import Low_Level_Design.MachineCodingRound.Design_Vending_Machine.VendingMachine.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Item item = new Item("Coca-Cola", 12,1);
        vendingMachine.addItem(item);
        vendingMachine.getVendingMachineState().insertCoin(vendingMachine);
        vendingMachine.getVendingMachineState().selectItem(vendingMachine);
        vendingMachine.getVendingMachineState().madePaymentState(vendingMachine);
    }
}
