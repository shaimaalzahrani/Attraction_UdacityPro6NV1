package com.example.mypc.attraction_udacitypro6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
            R.drawable.imageC1,
            R.drawable.imageC2,
            R.drawable.imageC3,
            R.drawable.imageC4,
            R.drawable.imageC5

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffees);

        CustomList adapter = new
                CustomList(Coffees.this, CoffName, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Coffees.this, "You Clicked at " +CoffName[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}
