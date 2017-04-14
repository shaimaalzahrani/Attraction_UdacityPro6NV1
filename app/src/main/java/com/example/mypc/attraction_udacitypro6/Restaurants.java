package com.example.mypc.attraction_udacitypro6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Restaurants extends AppCompatActivity {

    ListView list;
    String[] ResName = {
            "Dolce",
            "Figaro",
            "Cush",
            "Cinque"

    } ;
    Integer[] imageId = {
            R.drawable.imager1,
            R.drawable.imager2,
            R.drawable.imager3,
            R.drawable.imager4

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        CustomList adapter = new
                CustomList(Restaurants.this, ResName, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}
