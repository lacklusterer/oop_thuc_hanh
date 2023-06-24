package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.cart.Cart;
import hust.soict.cs01.aims.store.Store;

import java.util.Arrays;

public class StoreMenu extends BaseMenu{
    public StoreMenu(Store store, Cart cart) {
        super(store, cart);
        this.options = Arrays.asList(
                "See a media’s details",
                "Add a media to cart",
                "Play a media",
                "See current cart"
        );
    }

    @Override
    public void showInfo() {
        store.print();
    }

    @Override
    public void processChoice(int choice) {
        switch (choice) {
            case 1 -> {
                // Option 1
            }
            case 2 -> {
                // option 2
            }
            case 3 -> {
                // option 3
            }
            case 4 -> {
                // option 4
            }
        }
    }
}
