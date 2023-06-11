package hust.soict.cs01.test.store;

import hust.soict.cs01.aims.media.DigitalVideoDisc;
import hust.soict.cs01.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {


        Store Store1 = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Obama: The Movie",
                "Comedy", 29.99f, 180, "Michael Bay");
        Store1.addDVD(dvd1);
        Store1.removeDVD(dvd1);
    }
}
