package hust.soict.cs01.aims.media;

import javax.swing.*;

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

    @Override
    public String toString() {
        return "DigitalVideoDisc\n" +
                "title='" + title + '\'' +
                ", cost=" + cost +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                ", length=" + length;
    }

    @Override
    public void play() {
        // old play dvd
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());

        // play dvd but gui
        JFrame frame = new JFrame("DVD Player");
        JPanel panel = new JPanel();

        panel.add(new JLabel("Playing DVD: " + title));
        panel.add(new JLabel("DVD length: " + length));

        frame.getContentPane().add(panel);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}