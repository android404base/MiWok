package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private Integer backgroundColor;

    public WordAdapter(Context context, int resource,List<Word> objects,int backgroundColor) {
        super(context, resource, objects);
        this.backgroundColor = backgroundColor;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }

        Word currentNumber = getItem(position);

        TextView tvDefaultTranslation = listItemView.findViewById(R.id.tv_english);
        tvDefaultTranslation.setText(currentNumber.getDefaultTranslation());


        TextView tvMiwokTranslation = listItemView.findViewById(R.id.tv_miwok);
        tvMiwokTranslation.setText(currentNumber.getMiwokTranslation());
        ImageView imageView = listItemView.findViewById(R.id.image_view);

        if(currentNumber.getImageExist()) {
            imageView.setImageResource(currentNumber.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }


        View textContainer = listItemView.findViewById(R.id.text_background);
        int color = ContextCompat.getColor(getContext(),backgroundColor);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }


}
