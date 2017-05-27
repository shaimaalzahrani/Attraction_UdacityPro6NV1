package com.example.mypc.attraction_udacitypro6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


public class Attractions extends AppCompatActivity {

    ListView list;
    Place[] attractionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);

        attractionsList = new Place[2];

        Place place1 = new Place(R.string.Att1+"",R.drawable.imagea2);
        attractionsList[0] = place1;

        Place place2 = new Place(R.string.Att2+"",R.drawable.imagea3);
        attractionsList[1] = place2;

        CustomList adapter = new
                CustomList(Attractions.this, attractionsList);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
