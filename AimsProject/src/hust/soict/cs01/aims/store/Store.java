package hust.soict.cs01.aims.store;

import hust.soict.cs01.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private int storageSpace = 200;
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    // Add dvd method
    public void addMedia (Media media) {
        if (itemsInStore.size() < storageSpace) {
            itemsInStore.add(media);
            System.out.printf("Added media %s to store's inventory\n", media.getTitle());
        } else {
            System.out.println("Store is full!");
        }
    }

    // Remove dvd method
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.printf("Removed media %s from store's inventory\n", media.getTitle());
        } else {
            System.out.println("Media not found");
        }
    }

    public void displayMenu() {

    }
}
