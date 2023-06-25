package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.mediaconcontainer.cart.Cart;
import hust.soict.cs01.aims.mediaconcontainer.store.Store;

import java.util.Arrays;
import java.util.Scanner;

public class MainMenu extends BaseMenu {
    public MainMenu(Store store, Cart cart, Scanner scanner) {
        super(store, cart, scanner);
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
                StoreMenu storeMenu = new StoreMenu(this);
                storeMenu.showMenu();
            }
            case 2 -> {
                UpdateMenu updateMenu = new UpdateMenu(this);
                updateMenu.showMenu();
            }
            case 3 -> {
                CartMenu cartMenu = new CartMenu(this);
                cartMenu.showMenu();
            }
        }
    }
}
