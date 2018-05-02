package com.example.alumno.vwmove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SelectionActivity extends AppCompatActivity {

    ImageButton crafter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        Intent intent = getIntent();
        TextView user = (TextView)findViewById(R.id.textView8);
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
