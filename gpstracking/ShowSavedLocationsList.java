package com.example.gpstracking;

import android.location.Location;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ShowSavedLocationsList extends AppCompatActivity {

    ListView lv_wayPoints;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_saved_locations_list);

        lv_wayPoints = findViewById(R.id.lv_wayPoints);

        MyApplication myApplication = (MyApplication)getApplicationContext();
        List<Location> saveLocations = myApplication.getMyLocations();

        lv_wayPoints.setAdapter(new ArrayAdapter<Location>(this, android.R.layout.simple_list_item_1,saveLocations));


    }
}