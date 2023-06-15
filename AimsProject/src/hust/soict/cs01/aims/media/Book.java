package hust.soict.cs01.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.printf("%s is already in the authors list\n", authorName);
        } else {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            System.out.printf("%s is not in the authors list\n", authorName);
        } else {
            authors.remove(authorName);
        }
    }

    @Override
    public String toString() {
        return "Book\n" +
                "title='" + title + '\'' +
                ", cost=" + cost +
                ", category='" + category + '\'' +
                ", authors=" + authors;
    }
}
