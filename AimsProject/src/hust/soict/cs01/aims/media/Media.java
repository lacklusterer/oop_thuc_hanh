package hust.soict.cs01.aims.media;

import hust.soict.cs01.aims.comparators.MediaComparatorByCostTitle;
import hust.soict.cs01.aims.comparators.MediaComparatorByTitleCost;

import java.util.Comparator;
import java.util.Objects;

public abstract class Media {

    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();

    protected String title;
    protected String category;
    protected float cost;
    protected int id;
    private static int nbMedia = 0;
    public boolean isMatch(String title) {
        return Objects.equals(this.title, title);
    }
    // Instance initializer
    {
        nbMedia++;
        id = nbMedia;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(String title) {
        this.title = title;
    }

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

}
