package pkg;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = disc;
        } else {
            System.out.println("Cart is full!");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        for (var disc: dvdList) addDigitalVideoDisc(disc);
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                qtyOrdered--;
                itemsOrdered[i] = null;
                break;
            }
        }
    }

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
}