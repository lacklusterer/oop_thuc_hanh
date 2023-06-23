package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.cart.Cart;
import hust.soict.cs01.aims.store.Store;

import java.util.Arrays;

public class CartMenu extends BaseMenu{

    public CartMenu(Store store, Cart cart) {
        super(store, cart);
        this.options = Arrays.asList(
                "Filter medias in cart",
                "Sort medias in cart",
                "Remove media from cart",
                "Play a media",
                "Place order"
        );
    }

    @Override
    public void showInfo() {
        cart.print();
    }

    @Override
    public void processChoice(int choice) {
        switch (choice) {
            case 1 -> {
                System.out.println("Filter medias in cart by (1) id or (2) title?");
                int sortType = scanner.nextInt();
                scanner.nextLine(); // consumes newline character
                if (sortType == 1) {
                    System.out.println("Enter media's id: ");
                    cart.searchById(scanner.nextInt());
                } else if (sortType == 2) {
                    System.out.println("Enter media's title: ");
                    String title = scanner.nextLine();
                    cart.searchByTitle(title.trim());
                } else {
                    System.out.println("Invalid input");
                }
            }

            case 2 -> {
                System.out.println("Sort medias in cart by (1) title-cost or (2) cost title?");
                int sortType = scanner.nextInt();
                if (sortType == 1) {
                    cart.sortByTitleCost();
                    System.out.println("Sorted by title-cost");
                } else if (sortType == 2) {
                    cart.sortByCostTitle();
                    System.out.println("Sorted by cost-title");
                } else {
                    System.out.println("Invalid input");
                }
            }

            case 3 -> {
                System.out.println("Remove media from cart");
            }

            case 4 -> {
                System.out.println("Play a media");
            }

        }
    }
}
