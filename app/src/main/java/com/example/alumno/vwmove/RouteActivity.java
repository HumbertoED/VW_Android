package com.example.alumno.vwmove;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class RouteActivity extends AppCompatActivity {

    Button profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(listener);

        profile = (Button)findViewById(R.id.toolbar_profile);

    }

    public void go_profile(View v){
        Intent prof = new Intent(this, ProfileActivity.class);
        startActivity(prof);
    }

    BottomNavigationView.OnNavigationItemSelectedListener listener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    android.support.v4.app.Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.navigation_routes:
                            selectedFragment = new RoutesFragment();
                            break;
                        case R.id.navigation_alerts:
                            selectedFragment = new AlertsFragment();
                            break;
                        case R.id.navigation_passengers:
                            selectedFragment = new PassengerFragment();
                            break;
                        case R.id.navigation_notifications:
                            selectedFragment = new NotificationsFragment();
                            break;

                    }

                    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                    transaction.replace(R.id.fragment_container, selectedFragment);
                    transaction.commit();

                    return true;
                }
            };
}
