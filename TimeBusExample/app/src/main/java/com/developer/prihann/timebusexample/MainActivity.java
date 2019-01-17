package com.developer.prihann.timebusexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.developer.prihann.time_bus.logics.TimeBus;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimeBus.setContext(getApplicationContext());
        Log.d("aaaaaaaaaaaaanb",TimeBus.convertDatetoString(new Date()));
    }
}
