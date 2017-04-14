package com.example.mypc.attraction_udacitypro6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Attr;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView Attrac;
    TextView Restu;
    TextView Coffee;
    TextView Park;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Attrac = (TextView)findViewById(R.id.Att);
        Restu = (TextView)findViewById(R.id.Res);
        Coffee = (TextView)findViewById(R.id.Cof);
        Park = (TextView)findViewById(R.id.Park);

    }

    public void onClick(View view){
        if(view == Attrac){
            Intent intent = new Intent(this, Attractions.class);
            startActivity(intent);
        }
        else if(view == Restu){
            Intent intent = new Intent(this, Restaurants.class);
            startActivity(intent);
        }
        else if(view == Coffee){
            Intent intent = new Intent(this, Coffees.class);
            startActivity(intent);
        }
        else if(view == Park){
            Intent intent = new Intent(this, Parks.class);
            startActivity(intent);
        }

    }
}
