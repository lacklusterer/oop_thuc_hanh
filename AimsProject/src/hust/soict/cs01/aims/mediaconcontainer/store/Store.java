package hust.soict.cs01.aims.mediaconcontainer.store;

import hust.soict.cs01.aims.mediaconcontainer.MediaContainer;
import hust.soict.cs01.aims.media.Media;

import java.util.ArrayList;
import java.util.Arrays;

public class Store implements MediaContainer {
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

    public void addMedia (Media ... medias) {
        itemsInStore.addAll(Arrays.asList(medias));
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

    @Override
    public Media searchByTitle(String title) {
        for (Media item : itemsInStore) {
            if (item.isMatch(title)) {
                System.out.println(item);
                return item;
            }
        }
        return null;
    }

    public void print() {
        System.out.print("""
                ***********************Store**********************\s
                Items in store:
                """);
        int i = 0;
        for (Media media : itemsInStore) {
            System.out.printf("%d. %s\n", i + 1, media.toString());
            i++;
        }
        System.out.println("***************************************************");
    }
}