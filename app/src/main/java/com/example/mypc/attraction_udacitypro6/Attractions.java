package com.example.mypc.attraction_udacitypro6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


public class Attractions extends AppCompatActivity {

    ListView list;
    String[] AttName = {
            "Florence Cathedral",
            "St Peter's Basilica"
    } ;
    Integer[] imageId = {
            R.drawable.imagea2,
            R.drawable.imagea4

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
