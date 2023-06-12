package hust.soict.cs01.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracksList;

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String title, String category, float cost, String artist) {
        super(title, category, cost);
        this.artist = artist;
        this.tracksList = new ArrayList<Track>();
    }

    public void addTrack(Track track) {
        if (tracksList.contains(track)) {
            System.out.println("Track is already in track list");
        } else {
        tracksList.add(track);
        }
    }

    public void removeTrack(Track track) {
        if (!tracksList.contains(track)) {
            System.out.println("Track is not in track list");
        } else {
        tracksList.remove(track);
        }
    }

    @Override
    public int getLength() {
        int sumLength = 0;
        for (Track track : tracksList) {
            sumLength += track.getLength();
        }
        return sumLength;
    }

    @Override
    public void play() {
        for (Track track : tracksList) {
            track.play();
        }
    }
}
