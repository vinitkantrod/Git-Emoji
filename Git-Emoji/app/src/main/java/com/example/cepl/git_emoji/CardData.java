package com.example.cepl.git_emoji;

/**
 * Created by cepl on 09/12/17.
 */

public class CardData {

    private String mTitle;
    private String mDescription;
    private int mImage;

    public CardData (String title, String description, int image) {
        mTitle = title;
        mDescription = description;
        mImage = image;
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
}
