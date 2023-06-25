package hust.soict.cs01.aims.console;

import hust.soict.cs01.aims.media.Book;
import hust.soict.cs01.aims.media.CompactDisc;
import hust.soict.cs01.aims.media.DigitalVideoDisc;

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
                Book book2Add = new Book(title, category, cost);
                System.out.println("(A)dd or (r)emove author:");
                String subChoice = scanner.nextLine().toLowerCase();
                System.out.println("Enter author's name:");
                String author = scanner.nextLine();
                switch (subChoice) {
                    case "a" -> book2Add.addAuthor(author);
                    case "r" -> book2Add.removeAuthor(author);
                    default -> System.out.println("Invalid input");
                }
                store.addMedia(book2Add);
                // TODO: Fix add/remove author
            }
            case 2 -> {
                CompactDisc cd2Add = new CompactDisc(title, category, cost);
                store.addMedia(cd2Add);
                // TODO: Add tracks
            }
            case 3 -> {
                System.out.println("Input length");
                int length = Integer.parseInt(scanner.nextLine());
                System.out.println("Input director's name");
                String director = scanner.nextLine();
                DigitalVideoDisc dvd2Add = new DigitalVideoDisc(title, category, cost, length, director);
                store.addMedia(dvd2Add);
            }
        }
    }
}