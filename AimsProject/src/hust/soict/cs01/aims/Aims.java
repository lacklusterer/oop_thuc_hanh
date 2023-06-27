package hust.soict.cs01.aims;

import hust.soict.cs01.aims.console.MainMenu;
import hust.soict.cs01.aims.mediaconcontainer.cart.Cart;
import hust.soict.cs01.aims.mediaconcontainer.store.Store;

import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Store store1 = new Store();
        Cart cart1 = new Cart();
        Scanner scanner = new Scanner(System.in);

        MainMenu mainMenu = new MainMenu(store1, cart1, scanner);
        mainMenu.showMenu();
    }
}