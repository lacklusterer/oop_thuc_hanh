package hust.soict.cs01.aims.media;

import hust.soict.cs01.aims.media.Media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    /*
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.setTitle(title);
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    */
    public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public boolean isMatch(String title) {
        return this.getTitle() == title;
    }

    @Override
    public String toString() {
        return "DVD - " +
                title + " - " +
                category + " - " +
                director + " - " +
                length + "mins : $" +
                cost;
    }
}