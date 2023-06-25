package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.cart.Cart;
import hust.soict.cs01.aims.media.Media;
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
                int searchType = Integer.parseInt(scanner.nextLine());
                if (searchType == 1) {
                    System.out.println("Enter media's id: ");
                    cart.searchById(Integer.parseInt(scanner.nextLine()));
                } else if (searchType == 2) {
                    System.out.println("Enter media's title: ");
                    String title = scanner.nextLine();
                    Media foundMedia = cart.searchByTitle(title.trim());
                    if (foundMedia != null) {
                        System.out.println("Found media!");
                        System.out.println(foundMedia);
                    } else {
                        System.out.println("No match!");
                    }

                } else {
                    System.out.println("Invalid input");
                }
            }

            case 2 -> {
                System.out.println("Sort medias in cart by (1) title-cost or (2) cost title?");
                int sortType = Integer.parseInt(scanner.nextLine());
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
                System.out.println("Enter media's title: ");
                String title = scanner.nextLine();
                Media mediaToRemove = cart.searchByTitle(title);
                if (mediaToRemove != null) {
                    cart.removeMedia(mediaToRemove);
                    System.out.printf("Removed %s from cart\n", title);
                } else {
                    System.out.println("No match!");
                }
            }

            case 4 -> {
                System.out.println("Play a media");
            }

        }
    }
}
