package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.media.Media;
import hust.soict.cs01.aims.mediaconcontainer.cart.Cart;
import hust.soict.cs01.aims.mediaconcontainer.store.Store;

import java.util.Arrays;

public class MediaDetailsMenu extends BaseMenu { // enter from StoreMenu - option 1

    public MediaDetailsMenu(BaseMenu menu, Media media) {
        super(menu);
        this.options = Arrays.asList(
                "Add to cart",
                "Play"
        );
    }

    @Override
    public void showInfo() {

     }

    @Override
    public void processChoice(int choice) {
        switch (choice) {
            case 1 -> {
                // Add to cart
            }
            case 2 -> {
                // Play, only available if playable
            }
        }
    }
}
