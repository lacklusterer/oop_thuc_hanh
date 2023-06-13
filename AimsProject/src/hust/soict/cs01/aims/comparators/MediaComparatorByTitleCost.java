package hust.soict.cs01.aims.comparators;

import hust.soict.cs01.aims.media.Media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

    @Override
    public int compare(Media media1, Media media2) {
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());

        if (titleComparison != 0) {
            return titleComparison;
        }

        return Float.compare(media1.getCost(), media2.getCost());
    }
}
