package Low_Level_Design.MachineCodingRound.Design_Vending_Machine.VendingMachine;

import java.util.HashMap;

public class Purchased {
    private HashMap<Item,Integer> itemsList;
    private int rupees;
    public Purchased(){
        this.itemsList = new HashMap<>();
    }
    public HashMap<Item,Integer> getItemsList() {
        return itemsList;
    }
    public void addItem(Item item,int val){
        itemsList.put(item, itemsList.getOrDefault(item, 0)+val);
    }
    public int getRupees() {
        return rupees;
    }
    public void setRupees(int rupees) {
        this.rupees = rupees;
    }
    
}
