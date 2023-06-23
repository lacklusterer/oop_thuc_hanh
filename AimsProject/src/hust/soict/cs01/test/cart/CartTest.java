package hust.soict.cs01.test.cart;

import hust.soict.cs01.aims.media.Book;
import hust.soict.cs01.aims.media.CompactDisc;
import hust.soict.cs01.aims.media.DigitalVideoDisc;
import hust.soict.cs01.aims.cart.Cart;
import hust.soict.cs01.aims.media.Media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartTest {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        Scanner scanner = new Scanner(System.in);

        //New dvd, add to cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Obama: The Movie", "Comedy", 29.99f, 180, "Michael Bay");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Morbius 2: Morbing time", "Action Comedy", 39.99f, 165, "Daniel Espinosa");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 19.99f);
        anOrder.addMedia(dvd1);
        anOrder.addMedia(dvd2);
        anOrder.addMedia(dvd3);

        // Get total cost
        // System.out.printf("Total cost is %.2f\n", anOrder.totalCost());

        anOrder.print(); // Print method test

        //Search method test
        //anOrder.searchById(2);
        anOrder.searchByTitle("Morbius 2: Morbing time");
        //anOrder.searchById(5);
        anOrder.searchByTitle("Aladiin");
        anOrder.searchByTitle(scanner.nextLine());


        // Sort comparator test
        /*
        List<Media> mediaList = new ArrayList<>();

        Book book1 = new Book("BookTitle", "BookCategory", 19.99f);
        CompactDisc cd1 = new CompactDisc("CDNuts", "CDCategory", 39.99f, "NaN");

        mediaList.add(book1);
        mediaList.add(cd1);
        mediaList.add(dvd1);

        mediaList.sort(Media.COMPARE_BY_COST_TITLE);

        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
        */
    }
}