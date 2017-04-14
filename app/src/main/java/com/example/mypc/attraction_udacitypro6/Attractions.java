package com.example.mypc.attraction_udacitypro6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


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
            R.drawable.imageA1,
            R.drawable.imageA2,
            R.drawable.imageA3,
            R.drawable.imageA4,
            R.drawable.imageA5

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);

        CustomList adapter = new
                CustomList(Attractions.this, AttName, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Attractions.this, "You Clicked at " +AttName[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}
