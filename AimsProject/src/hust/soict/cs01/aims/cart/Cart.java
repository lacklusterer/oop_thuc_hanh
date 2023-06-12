package hust.soict.cs01.aims.cart;

import hust.soict.cs01.aims.media.Media;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    /*
    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    // print method
    public void print() {
        System.out.printf("""
                ***********************CART***********************\s
                Ordered Items:
                """);
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.printf("%d. %s\n", i + 1, itemsOrdered[i].toString());
        }
        System.out.printf("""
                Total cost: %.2f$
                ***************************************************
                """, totalCost());
    }

    // Search methods
    public void searchID(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println(itemsOrdered[i]);
                return;
            }
        }
        System.out.println("No match!");
    }

    public void searchTitle(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println(itemsOrdered[i]);
                return;
            }
        }
        System.out.println("No match!");
    }
    */
}