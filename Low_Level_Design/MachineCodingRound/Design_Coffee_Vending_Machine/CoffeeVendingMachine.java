package Low_Level_Design.MachineCodingRound.Design_Coffee_Vending_Machine;

import java.util.List;
import java.util.Scanner;

public class CoffeeVendingMachine {
    private List<Item> list;
    private Item selectedItem;
    private State state;
    public CoffeeVendingMachine(List<Item> list){
        this.list = list;
        state = new IdleState();
    }
    void printList(){
        System.out.println(list);
    }
    public Item getSelectedItem() {
        return selectedItem;
    }
    public void setSelectedItem(int index) {
        if(index == -1){
            this.selectedItem = null;
            return;
        }
        this.selectedItem = list.get(index);
    }
    public void addItems(Item item){
        list.add(item);
    }
    public State getState(){
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public void selectItems(Scanner scanner){
        this.state.selectItems(this,scanner);
    }
    public void dispatchItems(){
        this.state.dispatchItems(this);
    }
    public void cancelTransaction(){
        this.state.cancelTransaction(this);
    }
}
