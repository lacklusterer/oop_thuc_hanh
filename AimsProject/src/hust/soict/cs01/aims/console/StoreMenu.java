package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.media.Media;
import hust.soict.cs01.aims.media.Playable;

import java.util.Arrays;

public class StoreMenu extends BaseMenu{
    public StoreMenu(BaseMenu menu) {
        super(menu);
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
                Media mediaToGetDetails = promptUser4Media(store);
                if (mediaToGetDetails != null) {
                    new MediaDetailsMenu(this, mediaToGetDetails).showMenu();
                }
            }

            case 2 -> {
                Media mediaToAdd = promptUser4Media(store);
                if (mediaToAdd != null) {
                    cart.addMedia(mediaToAdd);
                    System.out.printf("Added %s to cart\n", mediaToAdd.getTitle());
                }
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

            case 4 -> new CartMenu(this).showMenu();
        }
    }
}