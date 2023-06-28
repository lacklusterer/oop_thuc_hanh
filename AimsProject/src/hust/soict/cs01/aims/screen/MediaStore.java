package hust.soict.cs01.aims.screen;

import javax.swing.*;

import hust.soict.cs01.aims.media.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediaStore extends JPanel {
    private Media media;
    public MediaStore(Media media) {

        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("$"+ media.getCost());
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        container.add(new JButton("Add to cart"));

        if (media instanceof Playable) {
            JButton playButton = new JButton("Play");
            playButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    // create a dialog Box
                    JDialog playDialog = new JDialog(new JFrame(), media.getTitle());
                    JLabel label;

                    if (media instanceof DigitalVideoDisc) {
                        DigitalVideoDisc dvd = (DigitalVideoDisc) media;
                        label = new JLabel("Playing DVD: " + dvd.getTitle() + "\n" + "DVD length: " + dvd.getLength());
                    } else {
                        CompactDisc cd = (CompactDisc) media;
                        StringBuilder trackPlay = new StringBuilder();
                        for (Track track : cd.getTracksList()) {
                            trackPlay.append("Playing Track: " + track.getTitle() + "\n" + "Track length: " + track.getLength()+"\n");
                        }
                        label = new JLabel(String.valueOf(trackPlay));
                    }

                    playDialog.add(label);

                    playDialog.setSize(450, 450);

                    playDialog.setVisible(true);
                }
            });
            container.add(playButton);
        }


        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }


}
