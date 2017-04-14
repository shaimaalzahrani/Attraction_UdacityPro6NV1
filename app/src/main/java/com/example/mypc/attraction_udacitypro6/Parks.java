package com.example.mypc.attraction_udacitypro6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Parks extends AppCompatActivity {

    ListView list;
    String[] ParkName = {
            "Val Grande",
            "Stelvio",
            "Gran Paradiso "

    } ;
    Integer[] imageId = {
            R.drawable.imagep1,
            R.drawable.imagep2,
            R.drawable.imagep3

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);

        CustomList adapter = new
                CustomList(Parks.this, ParkName, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
