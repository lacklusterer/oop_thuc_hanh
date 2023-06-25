package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.mediaconcontainer.cart.Cart;
import hust.soict.cs01.aims.mediaconcontainer.store.Store;

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
            case 1 -> {
                StoreMenu storeMenu = new StoreMenu(store, cart);
                storeMenu.showMenu();
            }
            case 2 -> {
                UpdateMenu updateMenu = new UpdateMenu(store, cart);
                updateMenu.showMenu();
            }
            case 3 -> {
                CartMenu cartMenu = new CartMenu(store, cart);
                cartMenu.showMenu();
            }
        }
    }
}
