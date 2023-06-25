package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.mediaconcontainer.cart.Cart;
import hust.soict.cs01.aims.media.Media;
import hust.soict.cs01.aims.mediaconcontainer.store.Store;
import hust.soict.cs01.aims.mediaconcontainer.MediaContainer;

import java.util.List;
import java.util.Scanner;

public abstract class BaseMenu {
    protected Scanner scanner;
    protected List<String> options;
    protected String menuName = "Options";
    protected String backMessage = "Back";
    public Store store;
    public Cart cart;

    // constructor
    protected BaseMenu(Store store, Cart cart, Scanner scanner) {
        this.store = store;
        this.cart = cart;
        this.scanner = scanner;
    }

    protected BaseMenu(BaseMenu menu) {
        this.store = menu.store;
        this.cart = menu.cart;
        this.scanner = menu.scanner;
    }

    private boolean running = true;

    // methods
    public void exit() {running = false;}
    public Media promptUser4Media(MediaContainer mediaContainer) { // input title, validate
        System.out.println("Enter media's title: ");
        String title = scanner.nextLine();
        Media foundMedia = mediaContainer.searchByTitle(title.trim());
        if (foundMedia == null) {
            System.out.println("No match!");
        }
        return foundMedia;
    }

        // abstract methods
    public abstract void showInfo();
    public abstract void processChoice(int choice);

    // Show menu method
    public void showMenu() {
        while (running) {
            showInfo(); // show menu-specific info

            System.out.println(menuName);
            System.out.println("--------------------------------"); // separator

            StringBuilder guideText = new StringBuilder("Please choose a number: 0"); // show options
            for (int i = 1; i <= options.size(); i++) {
                System.out.printf(i + ". " + options.get(i - 1) + "\n");
                guideText.append("-").append(i);
            }

            System.out.print("\n" + "0. " + backMessage + "\n" +
                    "--------------------------------" + "\n" + guideText + "\n"); // separator + guide

            // process choice
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 0) {
                    exit();
                } else if (choice > 0 && choice <= options.size()) {
                    processChoice(choice);
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and " + options.size() + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and " + options.size() + ".");
            }
        }
    }
}
