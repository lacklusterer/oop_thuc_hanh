package hust.soict.cs01.aims.comparators;

import hust.soict.cs01.aims.media.Media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media media1, Media media2) {
        int costComparison = Float.compare(media1.getCost(), media2.getCost());

        if (costComparison != 0) {
            return costComparison;
        }

        return media1.getTitle().compareTo(media2.getTitle());
    }
}
