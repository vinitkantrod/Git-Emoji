package com.example.cepl.git_emoji;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CardDetailsData extends AppCompatActivity {

    private TextView mTitleView;
    private TextView mDescriptionView;
    private ImageView mImageSrc;
    private RelativeLayout mImageBackgroundSrc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_details_data);

        Intent i = getIntent();
        String title = i.getStringExtra("title");
        String description = i.getStringExtra("description");
        int imageSrc = i.getIntExtra("imageSrc", R.mipmap.ic_launcher);
        int imageBackgroundColor = i.getIntExtra("imageBackgroundColor", R.color.alien);

        mTitleView =  (TextView) findViewById(R.id.details_emoji_textView);
        mTitleView.setText(title);
        mDescriptionView = (TextView) findViewById(R.id.details_brief_textView);
        mDescriptionView.setText(description);
        mImageSrc = (ImageView) findViewById(R.id.details_imageView);
        mImageSrc.setImageResource(imageSrc);
        mImageBackgroundSrc = (RelativeLayout) findViewById(R.id.details_background_colorId);
        mImageBackgroundSrc.setBackgroundResource(imageBackgroundColor);
    }
}
