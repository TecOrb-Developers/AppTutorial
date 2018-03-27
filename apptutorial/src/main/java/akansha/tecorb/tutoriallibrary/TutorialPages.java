package akansha.tecorb.tutoriallibrary;

import android.graphics.drawable.Drawable;

/**
 * Created by tecorb on 26/3/18.
 */

public class TutorialPages {

    private String title ;
    private String description ;
    private int imageResourceId;
    private int titleTextSize ;
    private int descriptionTextSize ;
    private int titleTextColor ;
    private int descriptionTextColor ;

    public TutorialPages(String title, String description, int image) {
        this.title = title ;
        this.description = description ;
        this.imageResourceId= image ;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public int getTitleTextSize() {
        return titleTextSize;
    }

    public int getDescriptionTextSize() {
        return descriptionTextSize;
    }

    public int getTitleTextColor() {
        return titleTextColor;
    }

    public int getDescriptionTextColor() {
        return descriptionTextColor;
    }

    public void setTitleColor(int titleColor) {
        this.titleTextColor = titleColor;
    }

    public void setDescriptionColor(int descriptionColor) {
        this.descriptionTextColor = descriptionColor;
    }

    public void setTitleTextSize(int titleTextSize) {
        this.titleTextSize = titleTextSize;
    }

    public void setDescriptionTextSize(int descriptionTextSize) {
        this.descriptionTextSize = descriptionTextSize;
    }
}
