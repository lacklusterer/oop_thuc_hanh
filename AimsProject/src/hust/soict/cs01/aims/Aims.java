package hust.soict.cs01.aims;

import hust.soict.cs01.aims.cart.Cart;
import hust.soict.cs01.aims.media.Book;
import hust.soict.cs01.aims.media.CompactDisc;
import hust.soict.cs01.aims.media.DigitalVideoDisc;
import hust.soict.cs01.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Aims {
    public static void main(String[] args) {
        //Create cart named anOrder
        Cart anOrder = new Cart();

        //New dvd, add to cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Obama: The Movie",
                "Comedy", 29.99f, 180, "Michael Bay");
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Morbius 2: Morbing time",
                "Action Comedy", 39.99f, 165,  "Daniel Espinosa");
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 19.99f);
        anOrder.addMedia(dvd3);

        anOrder.removeMedia(dvd3);

        //Get total cost
        System.out.printf("Total cost is %.2f\n", anOrder.totalCost());

        Book book1 = new Book("BookTitle", "BookCategory", 19.99f);
        CompactDisc cd1 = new CompactDisc("CDNuts", "CDCategory", 39.99f, "NaN");

        List<Media> mediaList = new ArrayList<>();

        mediaList.add(book1);
        mediaList.add(cd1);
        mediaList.add(dvd1);

        mediaList.sort(Media.COMPARE_BY_COST_TITLE);

        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
}