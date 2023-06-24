package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.cart.Cart;
import hust.soict.cs01.aims.store.Store;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public abstract class BaseMenu {
    protected Scanner scanner = new Scanner(System.in);
    protected List<String> options;
    protected String menuName = "Options";
    protected String backMessage = "Back";
    public Store store;
    public Cart cart;

    // constructor
    public BaseMenu(Store store, Cart cart) {
        this.store = store;
        this.cart = cart;
    }

    private boolean running = true;

    // methods
    public void exit() {running = false;}
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
                int choice = scanner.nextInt();
                if (choice == 0) {
                    exit();
                } else if (choice > 0 && choice <= options.size()) {
                    processChoice(choice);
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and " + options.size() + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and " + options.size() + ".");
            }
        }
    }
}
