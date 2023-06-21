package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.cart.Cart;
import hust.soict.cs01.aims.store.Store;

import java.util.Arrays;

public class MainMenu extends BaseMenu {
    public MainMenu(Store store, Cart cart) {
        super(store, cart);
        this.options = Arrays.asList(
                "View store",
                "Update store",
                "See current cart");
    }

    @Override
    public void showInfo() {
        System.out.println("Aims");
        backMessage = "Exit";
    }

    @Override
    public void processOption(int choice) {
        switch (choice) {
            case 0 -> exit(); // exits
            case 1 -> {
                // View store
                store.print();
            }
            case 2 -> {
                // Update store
                System.out.println("Update store");
            }
            case 3 -> {
                // Print cart
                System.out.println("Print cart");
            }
        }
    }
}
