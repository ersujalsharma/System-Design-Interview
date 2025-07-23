package Low_Level_Design.MachineCodingRound.Design_Vending_Machine.VendingMachine;

public class PaymentState implements VendingMachineState {

    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCoin'");
    }

    @Override
    public void selectItem(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectItem'");
    }

    @Override
    public void madePaymentState(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        vendingMachine.vendingMachineState = new IdleState();
        if(vendingMachine.purchased.getRupees()>vendingMachine.wallet.getBalance()){
            System.out.println("Refund Money");
            return;
        }
        System.out.println("Successful");
    }
}
