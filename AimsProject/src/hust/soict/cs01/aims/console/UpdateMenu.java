package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.mediaconcontainer.cart.Cart;
import hust.soict.cs01.aims.mediaconcontainer.store.Store;

import java.util.Arrays;

public class UpdateMenu extends BaseMenu {

    public UpdateMenu(Store store, Cart cart) {
        super(store, cart);
        this.options = Arrays.asList(
                "Add media",
                "Remove media"
        );
    }

    @Override
    public void showInfo() {
        System.out.println("Options");
        backMessage = "Back";
    }

    @Override
    public void processChoice(int choice) {
        switch (choice) {
            case 1 -> {
                // add media
            }
            case 2 -> {
                // remove media
            }
        }
    }
}
