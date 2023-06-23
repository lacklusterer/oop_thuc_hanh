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
                "See current cart"
        );
    }

    @Override
    public void showInfo() {
        menuName = "Aims";
        backMessage = "Exit";
    }

    @Override
    public void processChoice(int choice) {
        switch (choice) {
            // exits
            case 1 -> {
                store.print(); // stub
                // enters store menu
            }
            case 2 -> {
                System.out.println("Update store"); // stub
            }
            case 3 -> {
                CartMenu cartMenu = new CartMenu(store, cart);
                cartMenu.showMenu(); // display CartMenu
            }
        }
    }
}
