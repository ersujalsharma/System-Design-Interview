package Low_Level_Design.MachineCodingRound.Design_Vending_Machine.VendingMachine;

public class Item {
    private String name;
    private int price;
    private int quantity;
    public Item(String name,int price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
