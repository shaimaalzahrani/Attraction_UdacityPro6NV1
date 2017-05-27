package com.example.mypc.attraction_udacitypro6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Parks extends AppCompatActivity {

    ListView list;
    Place[] parksList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);

        parksList = new Place[3];

        Place place1 = new Place(R.string.p1+"",R.drawable.imagep1);
        parksList[0] = place1;

        Place place2 = new Place(R.string.p2+"",R.drawable.imagep1);
        parksList[1] = place2;

        Place place3 = new Place(R.string.p3+"",R.drawable.imagep1);
        parksList[2] = place3;

        CustomList adapter = new
                CustomList(Parks.this, parksList);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
