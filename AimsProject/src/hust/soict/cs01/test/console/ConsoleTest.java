package hust.soict.cs01.test.console;

import hust.soict.cs01.aims.cart.Cart;
import hust.soict.cs01.aims.console.MainMenu;
import hust.soict.cs01.aims.media.Book;
import hust.soict.cs01.aims.media.CompactDisc;
import hust.soict.cs01.aims.media.DigitalVideoDisc;
import hust.soict.cs01.aims.store.Store;

public class ConsoleTest {
    public static void main(String[] args) {
        Store store1 = new Store();
        Cart cart1 = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Obama: The Movie", "Comedy", 29.99f, 180, "Michael Bay");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Morbius 2: Morbing time", "Action Comedy", 39.99f, 165, "Daniel Espinosa");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 19.99f);
        Book book1 = new Book("BookTitle", "BookCategory", 19.99f);
        CompactDisc cd1 = new CompactDisc("CDNuts", "CDCategory", 39.99f, "NaN");

        store1.addMedia(dvd1, dvd2, dvd3, book1, cd1);

        MainMenu mainMenu = new MainMenu(store1, cart1);
        mainMenu.showMenu();
    }
}
