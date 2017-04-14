package com.example.mypc.attraction_udacitypro6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Restaurants extends AppCompatActivity {

    ListView list;
    String[] ResName = {
            "Dolce",
            "Figaro",
            "Cush",
            "Cinque"

    } ;
    Integer[] imageId = {
            R.drawable.imageR1,
            R.drawable.imageR2,
            R.drawable.imageR3,
            R.drawable.imageR4

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        CustomList adapter = new
                CustomList(Restaurants.this, ResName, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Restaurants.this, "You Clicked at " +ResName[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}
