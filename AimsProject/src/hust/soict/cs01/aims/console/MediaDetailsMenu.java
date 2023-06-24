package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.cart.Cart;
import hust.soict.cs01.aims.store.Store;

import java.util.Arrays;

public class MediaDetailsMenu extends BaseMenu { // enter from StoreMenu - option 1

    public MediaDetailsMenu(Store store, Cart cart) {
        super(store, cart);
        this.options = Arrays.asList(
                "Add to cart",
                "Play"
        );
    }

    @Override
    public void showInfo() {
        // prompt user to enter title -> display menu
        // check validity
    }

    @Override
    public void processChoice(int choice) {
        switch (choice) {
            case 1 -> {
                // Add to cart
            }
            case 2 -> {
                // Play, only available if playable
            }
        }
    }
}
