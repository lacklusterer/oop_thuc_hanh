package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.media.Media;
import hust.soict.cs01.aims.media.Playable;

import java.util.Arrays;

public class MediaDetailsMenu extends BaseMenu {
    private Media media;

    public MediaDetailsMenu(BaseMenu menu, Media media) {
        super(menu);
        this.media = media;
        this.options = Arrays.asList(
                "Add to cart",
                "Play"
        );
    }

    @Override
    public void showInfo() {
        if (media != null) {
            media.toString();
        }
    }

    @Override
    public void processChoice(int choice) {
        switch (choice) {
            case 1 -> {
                cart.addMedia(media);
                System.out.printf("Current item count: " + cart.currentItemsCount());
            }
            case 2 -> {
                if (!(media instanceof Playable playableMedia)) {
                    System.err.println("Error: The selected media cannot be played.");
                    return;
                }
                playableMedia.play();
            }
        }
    }
}
