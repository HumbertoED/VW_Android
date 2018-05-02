package com.example.alumno.vwmove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }

    public void log_in_2(View v){
        Intent login = new Intent(this, RouteActivity.class);
        startActivity(login);
    }

    public void confirmSelection(View v){
        Intent i = new Intent(this, SelecConfirmActivity.class);
        startActivity(i);
    }
}
