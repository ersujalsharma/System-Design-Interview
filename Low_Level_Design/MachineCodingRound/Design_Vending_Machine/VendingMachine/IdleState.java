package Low_Level_Design.MachineCodingRound.Design_Vending_Machine.VendingMachine;

import java.util.Scanner;

public class IdleState implements VendingMachineState {


    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        System.out.println("Insert Amount -- -");
        Scanner scanner = new Scanner(System.in);
        vendingMachine.getWallet().setBalance(scanner.nextInt());
        vendingMachine.vendingMachineState = new SelectionState();
    }

    @Override
    public void selectItem(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectItem'");
    }

    @Override
    public void madePaymentState(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'madePaymentState'");
    }

    
}
