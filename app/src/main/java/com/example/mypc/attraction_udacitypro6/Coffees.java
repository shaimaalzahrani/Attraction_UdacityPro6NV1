package com.example.mypc.attraction_udacitypro6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Coffees extends AppCompatActivity {

    ListView list;
    String[] CoffName = {
            "Molinari",
            "Antonion's",
            "Piccolo",
            "Mio Posto",
            "Segafredo"
    } ;
    Integer[] imageId = {
            R.drawable.imagec1,
            R.drawable.imagec2,
            R.drawable.imagec3,
            R.drawable.imagec4,
            R.drawable.imagec5

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffees);

        CustomList adapter = new
                CustomList(Coffees.this, CoffName, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}
