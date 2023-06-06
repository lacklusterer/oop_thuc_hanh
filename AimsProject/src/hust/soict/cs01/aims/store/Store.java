package hust.soict.cs01.aims.store;

import hust.soict.cs01.aims.disc.DigitalVideoDisc;

public class Store {
    private int storageSpace = 200;
    private DigitalVideoDisc[] itemsInStore =
            new DigitalVideoDisc[storageSpace];
    private int dvdCount = 0;

    // Add dvd method
    public void addDVD (DigitalVideoDisc disc) {
        if (dvdCount < storageSpace) {
            itemsInStore[dvdCount++] = disc;
            System.out.printf("Added dics %s to store's inventory\n", disc.getTitle());
        } else {
            System.out.println("Store is full!");
        }
    }

    // Remove dvd method
    public void removeDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < dvdCount; i++) {
            if (itemsInStore[i] == disc) {
                dvdCount--;
                itemsInStore[i] = null;
                System.out.printf("Removed dics %s from store's inventory\n", disc.getTitle());
                break;
            }
        }
    }
}
