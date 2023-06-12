package hust.soict.cs01.aims.media;

import hust.soict.cs01.aims.media.Media;

public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
        super(title, category, cost, length, director);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title) {
        super(title);
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

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}