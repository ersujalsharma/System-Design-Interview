package Low_Level_Design.MachineCodingRound.Design_Vending_Machine.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    Wallet wallet;
    List<Item> list;
    Purchased purchased;
    VendingMachineState vendingMachineState;
    public VendingMachine(){
        vendingMachineState = new IdleState();
        wallet = new Wallet();
        list = new ArrayList<>();
        purchased = new Purchased();
    }
    public void addItem(Item item){
        list.add(item);
    }
    public Wallet getWallet() {
        return wallet;
    }
    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
    public List<Item> getList() {
        return list;
    }
    public void setList(List<Item> list) {
        this.list = list;
    }
    public Purchased getPurchased() {
        return purchased;
    }
    public void setPurchased(Purchased purchased) {
        this.purchased = purchased;
    }
    public VendingMachineState getVendingMachineState() {
        return vendingMachineState;
    }
    public void setVendingMachineState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }
    
    
}
