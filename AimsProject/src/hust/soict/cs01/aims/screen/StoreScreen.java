package hust.soict.cs01.aims.screen;

import hust.soict.cs01.aims.mediaconcontainer.store.Store;

import javax.swing.*;

public class StoreScreen extends JFrame {
    private Store store;
    
    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        // north.add(createMenuBar());
        // north.add(createHeader());
        return north;
    }
}
