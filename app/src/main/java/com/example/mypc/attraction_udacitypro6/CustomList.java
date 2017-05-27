package com.example.mypc.attraction_udacitypro6;

/**
 * Created by shaimaalzahrani on 14/04/2017.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<Place>{

    private final Activity context;
    private final String[] Name;
    private final Integer[] imageId;
    public CustomList(Activity context,
                      Place[] places) {
        super(context, R.layout.item, places);
        this.context = context;

        Name = new String[places.length];
        imageId = new Integer[places.length];

        for (int i=0; i<places.length; i++){
            Name[i] = places[i].getPlaceName();
            imageId[i] = places[i].getPlaceImageId();
        }
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowV= inflater.inflate(R.layout.item, null, true);
        TextView name = (TextView) rowV.findViewById(R.id.txt);

        ImageView imageV = (ImageView) rowV.findViewById(R.id.img);
        name.setText(Name[position]);

        imageV.setImageResource(imageId[position]);
        return rowV;
    }
}
