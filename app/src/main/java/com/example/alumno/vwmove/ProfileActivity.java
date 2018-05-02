package com.example.alumno.vwmove;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    Button goPerformance;
    Button goPassword;
    Button goComments;
    Button goClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}
