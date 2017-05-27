package com.example.mypc.attraction_udacitypro6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Restaurants extends AppCompatActivity {

    ListView list;
    Place[] restaurantsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        restaurantsList = new Place[4];

        Place place1 = new Place(R.string.res1+"",R.drawable.imager1);
        restaurantsList[0] = place1;

        Place place2 = new Place(R.string.res2+"",R.drawable.imager2);
        restaurantsList[1] = place2;

        Place place3 = new Place(R.string.res3+"",R.drawable.imager3);
        restaurantsList[2] = place3;

        Place place4 = new Place(R.string.res4+"",R.drawable.imager4);
        restaurantsList[3] = place4;

        CustomList adapter = new
                CustomList(Restaurants.this, restaurantsList);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}
