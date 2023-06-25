package hust.soict.cs01.aims.console;

import java.util.Arrays;

public class AddMediaMenu extends BaseMenu {

    public AddMediaMenu(BaseMenu menu) {
        super(menu);
        this.options = Arrays.asList(
                "Book",
                "CompactDisc",
                "DigitalVideoDisc"
        );
    }

    @Override
    public void showInfo() {
        System.out.println("Select type of media to add");
    }

    @Override
    public void processChoice(int choice) {
        System.out.println("Input media's title");
        String title = scanner.nextLine();
        System.out.println("Input media's category");
        String category = scanner.nextLine();
        System.out.println("Input media's cost");
        float cost = Float.parseFloat(scanner.nextLine());

        switch (choice) {
            case 1 -> {
            }
            case 2 -> {
            }
            case 3 -> {
            }
        }
    }
}