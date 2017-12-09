package com.example.cepl.git_emoji;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by cepl on 09/12/17.
 */

public class CardAdapter extends ArrayAdapter<CardData> {

    public CardAdapter(Context context, ArrayList<CardData> cardData) {
        super(context, 0, cardData);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        CardData cardData = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_textView);
        titleTextView .setText(cardData.getTitle());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_textView);
        descriptionTextView.setText(cardData.getmDescription());

        ImageView shortImageView = (ImageView) listItemView.findViewById(R.id.short_image_view);
        shortImageView.setImageResource(cardData.getImageVIew());

        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.image_linearLayout);
        linearLayout.setBackgroundResource(cardData.getColor());

        return listItemView;
    }
}
