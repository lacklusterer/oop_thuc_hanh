package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.media.Media;

import java.util.Arrays;

public class UpdateMenu extends BaseMenu {

    public UpdateMenu(BaseMenu menu) {
        super(menu);
        this.options = Arrays.asList(
                "Add media",
                "Remove media"
        );
    }

    @Override
    public void showInfo() {
    }

    @Override
    public void processChoice(int choice) {
        switch (choice) {
            case 1 -> new AddMediaMenu(this).showMenu();
            case 2 -> {
                Media mediaToRemove = promptUser4Media(store);
                if (mediaToRemove != null) {
                    store.removeMedia(mediaToRemove);
                }
            }
        }
    }
}
