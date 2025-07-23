package Low_Level_Design.MachineCodingRound.Design_Vending_Machine.VendingMachine;

public interface VendingMachineState {
    public void insertCoin(VendingMachine vendingMachine);
    public void selectItem(VendingMachine vendingMachine);
    public void madePaymentState(VendingMachine vendingMachine);
}
