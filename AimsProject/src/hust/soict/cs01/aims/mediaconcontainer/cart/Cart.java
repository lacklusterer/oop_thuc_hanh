package hust.soict.cs01.aims.mediaconcontainer.cart;

import hust.soict.cs01.aims.mediaconcontainer.MediaContainer;
import hust.soict.cs01.aims.media.Media;
import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.*;

public class Cart implements MediaContainer {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = new ObservableList<Media>() {
        @Override
        public void addListener(ListChangeListener<? super Media> listChangeListener) {

        }

        @Override
        public void removeListener(ListChangeListener<? super Media> listChangeListener) {

        }

        @Override
        public boolean addAll(Media... media) {
            return false;
        }

        @Override
        public boolean setAll(Media... media) {
            return false;
        }

        @Override
        public boolean setAll(Collection<? extends Media> collection) {
            return false;
        }

        @Override
        public boolean removeAll(Media... media) {
            return false;
        }

        @Override
        public boolean retainAll(Media... media) {
            return false;
        }

        @Override
        public void remove(int i, int i1) {

        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Media> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Media media) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Media> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Media> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Media get(int index) {
            return null;
        }

        @Override
        public Media set(int index, Media element) {
            return null;
        }

        @Override
        public void add(int index, Media element) {

        }

        @Override
        public Media remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Media> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Media> listIterator(int index) {
            return null;
        }

        @Override
        public List<Media> subList(int fromIndex, int toIndex) {
            return null;
        }

        @Override
        public void addListener(InvalidationListener invalidationListener) {

        }

        @Override
        public void removeListener(InvalidationListener invalidationListener) {

        }
    };

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
        } else {
            System.out.println("Store is full!");
        }
    }

    public void addMedia (Media ... medias) {
        itemsOrdered.addAll(Arrays.asList(medias));
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
        } else {
            System.out.println("Media not found");
        }
    }

    public float totalCost() {
        float total = 0.0f;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Search methods
    public void searchById(int id) {
        for (Media item : itemsOrdered) {
            if (item.getId() == id) {
                System.out.println("Found media!");
                System.out.println(item);
                return;
            }
        }
        System.out.println("No match!");
    }

    @Override
    public Media searchByTitle(String title) {
        for (Media item : itemsOrdered) {
            if (item.isMatch(title)) {
                return item;
            }
        }
        return null; // No match found
    }

    public void placeOrder() {
        itemsOrdered.clear();
    }

    public void sortByTitleCost() {
        itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCostTitle() {
        itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
    }

    public void print() {
        System.out.print("""
                ***********************CART***********************\s
                Ordered Items:
                """);
        int i = 0;
        for (Media item : itemsOrdered) {
            System.out.printf("%d. %s\n", i + 1, item.toString());
            i++;
        }
        System.out.printf("""
                Total cost: %.2f$
                ***************************************************
                """, totalCost());
    }

    public int currentItemsCount() {
        return itemsOrdered.size();
    }

    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
}