package Low_Level_Design.MachineCodingRound.Design_Vending_Machine.VendingMachine;

import java.util.Scanner;

public class SelectionState implements VendingMachineState {


    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCoin'");
    }

    @Override
    public void selectItem(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        System.out.println("SSSSSSS");
        for(int i=0;i<vendingMachine.list.size();i++){
            System.out.print(vendingMachine.list.get(i).getName()+" "+
            vendingMachine.list.get(i).getPrice());
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        boolean val = true;
        while(val){
            System.out.println("Enter Product Number index");
            int index = scanner.nextInt();
            System.out.println("Enter Quantity");
            int quantity = scanner.nextInt();
            vendingMachine.purchased.addItem(vendingMachine.getList().get(index),quantity);
            vendingMachine.purchased.setRupees(vendingMachine.purchased.getRupees()+vendingMachine.getList().get(index).getPrice()*quantity);
            System.out.println("true for add more, else false");
            val = scanner.nextBoolean();
        }   
        System.out.println("Wanna Cancel the Transaction : TRUE : FALSE");
        boolean val2 = scanner.nextBoolean();
        if(val2) vendingMachine.vendingMachineState = new IdleState();
        else vendingMachine.vendingMachineState = new PaymentState();
   }

    @Override
    public void madePaymentState(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'madePaymentState'");
    }
}
