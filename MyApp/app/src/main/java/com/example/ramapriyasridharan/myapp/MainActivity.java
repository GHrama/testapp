package com.example.ramapriyasridharan.myapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import com.kinvey.android.Client;
import com.kinvey.android.callback.KinveyPingCallback;
import android.util.Log;


public class MainActivity extends AppCompatActivity {



    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    // When menu item selected this method called
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout main_layout = (RelativeLayout) findViewById(R.id.main_activity_layout); // assgin id to variable
        switch (item.getItemId()) {
            case R.id.menu_settings:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_layout.setBackgroundColor(Color.RED);
                return true;
            case R.id.menu_personal_info:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_layout.setBackgroundColor(Color.BLUE);
                return true;
            default:
                return super.onOptionsItemSelected(item);


                

        }
    }
}
