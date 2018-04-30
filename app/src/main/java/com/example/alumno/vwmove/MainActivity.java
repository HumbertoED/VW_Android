package com.example.alumno.vwmove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;
    Button forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password = (EditText)findViewById(R.id.passwordTxt);
        username = (EditText)findViewById(R.id.userTxt);
        login = (Button)findViewById(R.id.loginTxt);
        forgot = (Button)findViewById(R.id.forgotTxt);
    }

    public void log_in(View v){
        Intent login = new Intent(this, SelectionActivity.class);
        startActivity(login);
    }

    public void forgot_pass(){


    }
}
