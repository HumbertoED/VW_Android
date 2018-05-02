package com.example.alumno.vwmove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SelecConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selec_confirm);
    }

    public void login(View v){
        Intent i = new Intent(this, RouteActivity.class);
        startActivity(i);
    }

    public void go_back(View v){
        Intent i = new Intent(this, SelectionActivity.class);
        startActivity(i);
    }
}
