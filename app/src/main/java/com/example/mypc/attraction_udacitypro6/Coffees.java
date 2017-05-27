package com.example.mypc.attraction_udacitypro6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Coffees extends AppCompatActivity {

    ListView list;
    Place [] coffeesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffees);

        coffeesList = new Place[5];

        Place place1 = new Place(R.string.Coff1+"",R.drawable.imagec1);
        coffeesList[0] = place1;

        Place place2 = new Place(R.string.Coff2+"",R.drawable.imagec2);
        coffeesList[1] = place2;

        Place place3 = new Place(R.string.Coff3+"",R.drawable.imagec3);
        coffeesList[2] = place3;

        Place place4 = new Place(R.string.Coff4+"",R.drawable.imagec4);
        coffeesList[3] = place4;

        Place place5 = new Place(R.string.Coff5+"",R.drawable.imagec5);
        coffeesList[4] = place5;

        CustomList adapter = new
                CustomList(Coffees.this, coffeesList);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}
