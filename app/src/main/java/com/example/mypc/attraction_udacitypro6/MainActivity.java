package com.example.mypc.attraction_udacitypro6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Attr;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveToAtt(View view) {
        Intent intent = new Intent(this, Attractions.class);
        startActivity(intent);
    }

    public void moveToRes(View view) {
        Intent intent = new Intent(this, Restaurants.class);
        startActivity(intent);
    }

    public void moveToCof(View view) {
        Intent intent = new Intent(this, Coffees.class);
        startActivity(intent);
    }

    public void moveToPark(View view){
        Intent intent = new Intent(this, Parks.class);
        startActivity(intent);
    }
}
