package hust.soict.cs01.aims;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Book(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
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
}
