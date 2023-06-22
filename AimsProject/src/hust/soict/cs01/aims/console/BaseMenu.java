package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.cart.Cart;
import hust.soict.cs01.aims.store.Store;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public abstract class BaseMenu {
    protected Scanner scanner = new Scanner(System.in);
    protected List<String> options;
    protected String backMessage;
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
    public abstract void processOption(int choice);

    // Show menu method
    public void showMenu() {
        while (running) {
            showInfo(); // show info (menu name + menu-specific info)

            System.out.println("--------------------------------"); // separator

            StringBuilder guideText = new StringBuilder("Please choose a number: 0"); // show options
            for (int i = 1; i <= options.size(); i++) {
                System.out.printf(i + ". " + options.get(i - 1) + "\n");
                guideText.append("-").append(i);
            }

            System.out.print("\n" + "0. " + backMessage + "\n" +
                    "--------------------------------" + "\n" + guideText + "\n"); // separator + guide

            try {
                int choice = scanner.nextInt();
                if (choice == 0) {
                    exit();
                } else if (choice > 0 && choice <= options.size()) {
                    processOption(choice);
                } else {
                    System.out.println("Invalid input.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                scanner.next(); // Clear the non-integer input from the scanner
            }

        }
    }
}
