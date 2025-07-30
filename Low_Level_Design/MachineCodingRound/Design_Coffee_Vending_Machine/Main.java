package Low_Level_Design.MachineCodingRound.Design_Coffee_Vending_Machine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item item = new Item(0, "Cuppucino");
        Item item2 = new Item(1, "Latte");
        Item item3 = new Item(2, "Flat-White");
        Item item4 = new Item(4, "Water");
        List<Item> list = new ArrayList<>(Arrays.asList(item,item2,item3,item4));
        CoffeeVendingMachine coffeeVendingMachine = new CoffeeVendingMachine(list);
        coffeeVendingMachine.dispatchItems(); 
        coffeeVendingMachine.selectItems(scanner);
        // coffeeVendingMachine.cancelTransaction();
        coffeeVendingMachine.dispatchItems();
    }
}
