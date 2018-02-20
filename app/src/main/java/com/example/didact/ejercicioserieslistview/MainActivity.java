package com.example.didact.ejercicioserieslistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void nuevaserie (View view){

        Intent i=new Intent(getApplicationContext(),registroserieactivity.class);


        startActivity(i);

    }public void verseries (View view){

        Intent i=new Intent(getApplicationContext(),listaseriesactivity.class);


        startActivity(i);
    }
}
