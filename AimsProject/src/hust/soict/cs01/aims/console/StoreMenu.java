package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.mediaconcontainer.cart.Cart;
import hust.soict.cs01.aims.media.Media;
import hust.soict.cs01.aims.media.Playable;
import hust.soict.cs01.aims.mediaconcontainer.store.Store;

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
                Media mediaToPrint = promptUser4Media(store);
                try {
                    mediaToPrint.toString();
                } catch (NullPointerException ignored) {}
            }
            case 2 -> {
                Media mediaToAdd = promptUser4Media(store);
                    try {
                        cart.addMedia(mediaToAdd);
                        System.out.printf("Added %s to cart\n", mediaToAdd.getTitle());
                    } catch (NullPointerException ignored) {}
            }
            case 3 -> {
                Media media2Play = promptUser4Media(store);
                if (!(media2Play instanceof Playable playableMedia)) {
                    System.err.println("Error: The selected media cannot be played.");
                    return;
                }
                try {
                    playableMedia.play();
                } catch (NullPointerException ignored) {}
            }
            case 4 -> {
                CartMenu cartMenu = new CartMenu(store, cart);
                cartMenu.showMenu();
            }
        }
    }
}
