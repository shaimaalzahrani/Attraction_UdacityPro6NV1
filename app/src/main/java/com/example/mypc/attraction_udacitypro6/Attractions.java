package com.example.mypc.attraction_udacitypro6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


public class Attractions extends AppCompatActivity {

    ListView list;
    String[] AttName = {
            "Colosseum",
            "Florence Cathedral",
            "Grand Canal Venice",
            "St Peter's Basilica",
            "Roman Forum"
    } ;
    Integer[] imageId = {
            R.drawable.imagea1,
            R.drawable.imagea2,
            R.drawable.imagea3,
            R.drawable.imagea4,
            R.drawable.imagea5

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);

        CustomList adapter = new
                CustomList(Attractions.this, AttName, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
