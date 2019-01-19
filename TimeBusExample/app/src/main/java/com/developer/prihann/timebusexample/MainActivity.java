package com.developer.prihann.timebusexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.developer.prihann.time_bus.helper.DefaultFormat;
import com.developer.prihann.time_bus.library.TimeBus;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimeBus.setContext(getApplicationContext());
        Log.d("aaaaaaaaaaaaanb",TimeBus.convertDateToString(new Date(),DefaultFormat.getDefaultFormat(DefaultFormat.format01)));
    }
}
