package com.example.mypc.attraction_udacitypro6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Parks extends AppCompatActivity {

    ListView list;
    String[] ParkName = {
            "Val Grande",
            "Stelvio",
            "Gran Paradiso "

    } ;
    Integer[] imageId = {
            R.drawable.imageP1,
            R.drawable.imageP2,
            R.drawable.imageP3

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);

        CustomList adapter = new
                CustomList(Parks.this, ParkName, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Parks.this, "You Clicked at " +ParkName[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}
