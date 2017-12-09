package com.example.cepl.git_emoji;

/**
 * Created by cepl on 09/12/17.
 */

public class CardData {

    private String mTitle;
    private String mDescription;
    private int mImage;
    private int mColor;

    public CardData (String title, String description, int image, int color) {
        mTitle = title;
        mDescription = description;
        mImage = image;
        mColor = color;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getImageVIew() {
        return mImage;
    }

    public int getColor() {
        return mColor;
    }
}
