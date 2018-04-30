package com.example.alumno.vwmove;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class Routes extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            android.support.v4.app.Fragment selectedFrag = null;

            switch (item.getItemId()) {
                case R.id.navigation_routes:
                    selectedFrag = new RoutesFragment();
                    break;
                case R.id.navigation_passengers:
                    selectedFrag = new PassengerFragment();
                    break;
                case R.id.navigation_notifications:
                    selectedFrag = new NotificationsFragment();
                    break;
                case R.id.navigation_alerts:
                    selectedFrag = new AlertsFragment();
                    break;
            }

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.navigation, selectedFrag);
            transaction.commit();

            return true;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routes);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mListener);
    }

}
