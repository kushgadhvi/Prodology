package com.example.gadhvi.prodology2017;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by gadhvi on 07-01-2017.
 */

public class ImageView extends ArrayAdapter<String> {

    private final Activity context1;
    private final Integer[] imageId1;
    public ImageView(Activity context1,Integer[] imageId1) {
        super(context1, R.layout.image);
        this.context1 = context1;
        this.imageId1 = imageId1;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context1.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.image, null, true);
        android.widget.ImageView imageView = (android.widget.ImageView) rowView.findViewById(R.id.imge);
        imageView.setImageResource(imageId1[position]);
        return rowView;
    }
}