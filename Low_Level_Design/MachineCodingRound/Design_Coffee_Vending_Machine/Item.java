package Low_Level_Design.MachineCodingRound.Design_Coffee_Vending_Machine;

public class Item {
    private int itemId;
    private String itemName;
    public Item(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }
    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", itemName=" + itemName + "]";
    }
    
}
